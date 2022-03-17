# What is defined as Continus Delivery?

## What is Continus Delivery?
To first understand what this term is we have too look back at other close subject. Continus delivery is often used in an DevOps driven software cycle.  The process is quite simallar to an Agile work method. Thats why most starting developers often confuse it with

Only the question remains ofcourse what is now defined as Continus delivery?. To further understand this were gonna first look at what is different between the agile method and devops. From there were gonna look why Continus intergration and Continus delivery are connected. With that we can better define what Continus delivery is.

## Agile and DevOps? 
The key feature here is that DevOps often is seen as an part of agile method. Well in reality there are an few difference between them 
![[Pasted image 20220311130132.png]]

### Agile 
to first start over we need to understand better how agile works. Why? From an general point i belive its better that you understand Agile first before i tell you the difference between agile and Devops
 
 #### What is agile?
 Well to start here we have to go back in time to the early days of software development.  Back in these day we used to get an case from our customers and the developers saw eachother after the given time period again.
 
 This had its downsights. Because usally it gave an lot of headaches for the developers and what if the customer wanted something different. In the end that will increase the price for the customer. Also an negative point was that everything was thrown at an big bam release. This could end bad or good but usally endend bad.
 
 This is where agile came in life.  Agile is designed as an short time periode development where an set of features is plannend instead of the whole project.  The idea is of agile is to work in an small time period and deliver more to the customer. With this the customer can easly steer more on the project and give directions.
 
 This will lead to less headaches by the developers. Less time lossed in things that would have been made different and the Developers can easy adjust on the feedback from the customer.
 
 #### Agile work methods?
 So ofcourse with an new method to work their come an few new ways to work. I say ways because they are like an branch of the agile tree. There are plenty ways of how software companies these days work with. I am not gonna go to deep in to them but i will link [[What is defined as Continus Delivery#Bronnen]] where you can find an article on the different methods. Note these are an few examples.

### Devops
So what the difference. Well in devops the agile process is fairly automated. Stuff as continus intergration and the continus delivery/deployment come and take an look around the coroner. 

In devops it common that this process of agile is automated. Or at least the process up onto delivery to the customer. In an ideal situation the software that has been made is pushed on to the software repo.

In practie here is usally were we see 2-3 Repos. The first thing of the process here comes to look around. Continus intergration is the first part of this. Usally we see this back in the form of an pipeline. 

The pipeline usally runs the code and check to see if their are builds errors. its pushes them back to the repo. What do i mean with this? Well i show it in an image 
![[Pasted image 20220311143249.png]]
This images show excatly how CI works in short terms. What is missing here  what most Companies do is usally and second check on the testing. Bascailly if the code runs fine than and second pipeline 

What is done in the second pipeline is usally as followed. First all tests are run within the desired softwareproject. If one of them fails the pipeline returns the fails test and the developers  have to fix the test.

If even the test passes that means that most of the project would run fine and here is where we come to Continus Delivery.  To give an anwser to what is defined as Continus delivery. 

## Continus delivery
To start the main key difference here is that Continus delivery delivers code to an envoriment where the product is prepared for release. Like told earlier CD usally is an extension from CI. WIth this subject Developers can make an bug free and working product.

The ideal part is with this you can working on the product without the fear of something getting broken on release. This is the part what acctuly defines Continus delivery.

An automated process where code is prepared for production. This is usally pushed to an test/production envoriment. This envoriment is something where is not coded on and on that way always procted.

If an developers see the needs to change something they have to first make an commit to the CI pipeline. This check it then on build errors and testing erros. If all this passes the CD pipeline is called and the software is prepared for production. This can be pushed to an docker container for example.

As last note. Continus delivery still requires an appointment with the customer where the product is handed over. This can be either the final one or an product that the customer can test. As explained in [[What is defined as Continus Deployment]] then the process is complety automated and every pull request that succeesd is pushed to the customer directly 
## Bronnen
[CI vs CDelivery Vs CDeployment](https://www.atlassian.com/continuous-delivery/principles/continuous-integration-vs-delivery-vs-deployment)
[Agile and work methods](https://www.atlassian.com/agile)
[An introduction to CI and Continus delivery ](https://medium.com/@ranikamadurawe/continuous-integration-continuous-delivery-an-introduction-c7d40dfe9e06)
[Amazons look on Continuss Delivery](https://aws.amazon.com/devops/continuous-delivery/)




