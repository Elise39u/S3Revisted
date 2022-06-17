# So what are the pros and cons?
To start i hope you have read [[What is defined as Continus Delivery]] and [[What is defined as Continus Deployment]]. Well to start off lets look at what are the Pros of Continus delivery.

### Continus delivery pros
Were gonna divide the pros in to seprate subjects. In each subject il explain why its an benefit through sources and also give my own experince in it. 

#### Rapid increase in production 
The first main benefit for an CI pipeline with a Continus delivery pipeline is that there less time lost and preparing an software release. What do i mean with that? 
![[Pasted image 20220317102412.png]]

Developing software comes ofcourse with an few additions. First we have to prepare an build for production. This ofcourse can go smooth in one run. But we all know that it usally ends up with an few bugs here and there. Also there is the chance that an bug remains unseen and makes it way into production.

This is where Ci with CD is quite usefull.  An usal CI/CD pipeline is set up that the project is automatically build and test are automatically runned. In case everything passes than the proces is deployed to an test envoriment or production envoriment. In case something fails than we come by the next postive point of Continus delivery

#### Bugs/Issues are quickly isolated and detected. 
Thats is true. Normally the project is developed and made from time to time. In the weeks that there is a customer meeting than the project is prepared for delivery but what about bugs and issues? Well there in an chance that one gets undeteced into production or into the demo version.

But you think were all humans right? We should have tested everything? Yeah your right but even if you full proof test everything belive me a user finds a way to break your project. Also the chance of an bug bening in your production state is something we dont want right.

Ofcourse there is never an way to prevent an bug from finding it way into production but CD should prevent it from around 99%.
![[Pasted image 20220317110845.png]]

As show in the image an pipeline in this way is usally setted up in the way as follows:

	- Build pipeline.
	- Test pipeline.
	- Release pipeline.

I can see you think already. Why does this effect the bugs and etc? Well let me talk.  Software companies usally design this pipelines in the way that if one fails the process is stopped and its not release to the next pipeline.  In this way an issue/bug is quickly issolated. Which gives more time to fix it and leads to less time loss

#### Improving the Quality and Production rate.
An benefit that is showing quite often while reading through sources is that Continous delivery improves the quality of your code. That is given we all know that but an Suprising one is that it improves production rate.

What do i mean with that. Well there are 2 sides to this. The first one is your developers and the second is Overall production. Im gonna explain them in some detail further.

##### Developers
Why do i mention Developers. Well in an project where you working solo this really doesnt come to an effect.  But in bigger teams there is something that can rather hurt developers. What is the main thing you ask while its merging piece of code.

If your doning this right its also an piece that never will come bye. But there are scenes where you made something try to push it to dev and MERGE ERROR. Than you have some serious head errors on your mind. 

Most cases it can be easily solved and case closed. There are cases where a simpel click doesnt help. Than both developers have to come look and check what is wrong and what aint. This is costing time and sometimes brings frustrations.

In an CD pipeline this shouldnt helped since everything builds automatic and is tested automatic. In this reason if something fails you can check on your own what went wrong. This saves frustration and time for other developers. This also brings me to the next point.

##### Production rate
That is right since most of the proces is automated developers really can focus on developing and realising software. Which on its turn increases the production rate. Only time loss  is the fixing bugs and issues coming  from the pipelines. But they should be good and direct feedback if its made right

### Cons of continus delivery
So ofcourse with some benefits that are also some things that has to be an downside of this delivery you speak of. Well ofcourse there are an few downsights. but not that much. There is a point that is an downsight but Continous deployments goes there further

#### Deployment to the customer
The first thing is that is a bit of an nickle. Deployment is done to an production/testing envoriment.  The customer can have acces to this envoriment but its not an offical delivery. That is where the pain comes. There has to be time reserverd to still deliver the product to the customer. This also comes with an slight risk that are still bugs are present.  This slight con is not the biggest. Why? Continous deployment is where this is handeld of. But what is more than that is like an con or something to worry about? 

#### Are we developers ready for change?
As we move forward in time making software is rapidly changing. With it ofcourse comes more and more changes. But like i  said this helps developers but also for some developers its an big con. Why? well one simpel thing.

We humans are arfraid of changes. Because why would want to use something new while we know that the old one works.  The fear for the unknown is something we all hold as humand. Its something that can prevent developers for accepting Continus delivery. 

Ofcourse it can take some time and some good explantaion to get an developer on your side. Only this can cost times and sometime too much time. But this is probaly not the most know CON.

#### An strong and reliable server is required 
This is correct. An strong and reliable server is required for the testing side of this subject. In an side of small project the requirement for this server is not that high of an priorty. But imagine an project the size of like facebook where an lot of features are implemented. 

Now imagine that you change something and have to push it to your CI/CD pipeline. Well than the pipeline has to been build and afterward the project has to be tested. Only if you have an sever that is not strong or reliable, well it can bring some issues. The test can take some times and if the server is not strong. Than it can take some long time

This is ofcourse an issue. Why? Well as long that pipeline is running any other developer cant push to the branch.  Also that takes time and with that times lost it means no further code developement. 

This is are just an few cons and there are an few more but lets keep an look further at [[Pros and Cons of Continus Deployment]] Since Continus Delivery and Deployment share a bunch of pros and cons but there are also an few difference ones 
### Bronnen 
[10 benefits for CI with CDelivery](https://katalon.com/resources-center/blog/benefits-continuous-integration-delivery)
[What is Continus delivery with an few benefits](https://www.zend.com/blog/continuous-delivery-benefits-and-barriers)
[Amazon docs on Continuous delivery](https://docs.aws.amazon.com/whitepapers/latest/practicing-continuous-integration-continuous-delivery/benefits-of-continuous-delivery.html)

[What is COntinus delivery and what are Pros and Cons?](https://www.techtarget.com/searchsoftwarequality/tip/The-pros-and-cons-of-CI-CD-pipelines)
[What is CI/CD/CD and what are benefits](https://www.ionos.com/digitalguide/websites/web-development/continuous-delivery/)
[Holland fintech and how do we experience CI/CD](https://hollandfintech.com/2021/01/intellias-the-advantages-and-disadvantages-of-ci-cd-for-fintech/)

[The fear of change and why?](https://www.uopeople.edu/blog/why-you-have-fear-of-change-all-the-ways-to-overcome-it/#:~:text=We%20fear%20change%20because%20it,known%20comes%20to%20an%20end.)
[Why is change so scarry?](https://www.inc.com/scott-mautz/science-says-this-is-why-you-fear-change-and-what-to-do-about-it.html)
[How to overcome changes and the fear for it](https://www.psychologytoday.com/us/blog/the-adaptive-mind/201809/how-overcome-the-fear-change)


