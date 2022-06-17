# How does it go in the professional workfloor
First of all when toughting of the quesitons. This one seemed to me intresting to look at. Because why learn it the bad way if there are plenty of professional examples out there. On second thought this was underestimated. Why? well a CI/CD pipeline is usally a company secret. So what now. Lucky i was able to find a few examples that are roughly used to interact with the companies API

For each example lets take our project from [[What for effect has Continus delivery or deployment on the software architecture]]

Should we start looking at how an CI/CD pipeline looks on the Amazon AWS service 

## Amazon 
![[Pasted image 20220324092001.png]]

Lets start with the Amzon AWS service.
Let take our project that is staged on the *Github repo*. 

Let say that were gonna deploy to the AWS service and that we made a change to the backend. We added that a user location is now bening kept saved in the database. So that if a user closes the app and opens it. The user start from their last known location.

Well as shown in [[What for effect has Continus delivery or deployment on the software architecture]] The first we do in push the code to our Userstory branch. From their we are gonne call a source trigger. Think of it as like an push/merge to the dev branch.

On the next stage after the source the CI pipeline is called. With here you have a building stage and a testing stage. According to their documentation the Test/Building stage is done inside an Linux container

After this is made it installs TaskCat. The taskCat unpacks the code that has been zipped up after your source stage. After that it runs the code and the test and generates a report for you. This is upload to the S3 bucket. One note to tell here is that the Deploy stage is only bening runned on the moment that the test are succesfull.

After all that the code is runned through an Lambda after this is released into the releasing branch. One thing to make a note of here its doesnt say what happend on an error.

I think from this we can have a clear picture of how Amazon thinks of CI/CD. Ofcourse their own pipelines wont be shown. Because companies will keep it a secret. ![[Pasted image 20220324094811.png]]
I think with this picture and the one above its quite clear how Amazon would handle it. But lets see if we can find how other companies will do it.

## Facebook
Its was hard to find anthor company idea. But facebook has shown what is uses on their CI pipelines.

![[Pasted image 20220324095924.png]]

As we know facebook has quite a soms of projects. Lets think about:
- Andriod app
- Ios app
- Messenger IOS app
- Messenger Android app
- Website 

That are a lot of projects that facebook is using. So ofcourse its of a higher important that the CI pipeline works correct. Because you wouldnt want one going wrong or a massive bug to your deployment.

What we can tell from just looking at facebook that they use a Continus Deployment/Delivery pipeline. What does run on what then is what you think. Well lets keep it like this
- Continus deployment --> The website version for facebook and the messenger
- Continus delivery --> For the mobile app versions

### Facebook Webstie version
Why do i say that the website version has a continous deployment loop. Well never is facebook online on their website gonna ask you like. Hey we have a new update do you want to install it. No its directly tested through their Ci/CD pipeline and pushed you wouldnt see a thing.

### Facebook apps.
The different within their apps is up for questioning. Some would think its deployment because their app is always updated other think delivery because they need to update it on their own. This is the key difference

In theory you can adjust it as setting that your app keeps updating automaticlly. In that case you experince continus deployment. Why well since every update is directly pushed to you. But in reallity it is really Continus delivery.

Why do i say this. Facebook and other companies have decided against is in a few reasons. First of all most its an bad UX. Let me explain. If a user is using your app and a update forces them out of the app then the user is confused and randomly punished. Which in terms can lead to negativty. 

Ofcourse their is time where the update is critcal. Is forcing then allowed. Still i wouldnt say no. Reason why UX is rather important here but the critcal of the update also. Then you can decide to force close the app and update it. If you dont give an solid reason to the user than you can be at the bad UX

This is why the deliver the update to the IOS/Play store. From their you can choose to update it. Hands down continous delivery. But then its still important that you have a stable CI/CD that can handle the build/test/deploy quick and accurate.

## Bronnen
[Amazon AWS pipelines and how to use it ](https://aws.amazon.com/getting-started/hands-on/set-up-ci-cd-pipeline/)
[Amazon AWS what does it and explained](https://aws.amazon.com/quickstart/architecture/cicd-taskcat/)

[Deployment pipelines and everything around it](https://www.bmc.com/blogs/deployment-pipeline/)

[Apps and what happend on an update when you use them](https://www.engadget.com/2018-11-07-google-android-in-app-updates-api.html?guccounter=1&guce_referrer=aHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8&guce_referrer_sig=AQAAACPZJJjQgxsxmq_JlhxQptns2Xlk5Vs5YJBdEKQMqy_20uAiw6s2iMb0DAXLEldXRbU9ivLr6CoEQNYI5s2xGMoxxt3MbRS11TW8WaHbIIBRVQcnBBHPyUivqak4DiFt0nWwY7Nr4CAk21v-_0Q1cz50bXwyF4MB66sc3KVJGQuq)
[The problems behind updating apps](https://www.velvetech.com/blog/mobile-app-update/)
