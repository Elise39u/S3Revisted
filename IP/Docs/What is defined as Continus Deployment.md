# What is Defined as Continus Deployment? 

### What is the difference beteween Delivery and Deployment
So than you have an CI/CD pipeline, but a question remains? What is continus deployment. To explain we have to look first back at the architechture that is set up with an Continus intergration and Continus Deployment.

![[Pasted image 20220316090046.png]]

Above in the image is show an Continus Deliver pipeline. What already here is shown that the process of writing code to The story test is automated. Normally after the process is made the product is still not deliverd to the customer. It can that the customer has acces to the Test/Development envoriment where the code it published too.

But the offical product is still not complety by the customer. That is where Continuous delivery ends. 
![[Pasted image 20220316091311.png]]

As shown in the image above Continuous delivery most of the process is automated. The difference here is that the delivery to the customer is still in an way manual. Where in an Continuous Deployment loop the whole process is automated. 

This is where you have the defination of Continuous Delivery. Its the same process of Continuous Deployment. Only where delivery is still manualy done by Continuous delivery the process is complety automated by an Continuous Deployment line.

### What happends now at a Continuous Deployment line 
So we have developed what an Delivery and Deployment is. In the preivous chapter we already discussed what happends at an Delivery line. But how does it go in an Deployment line.

![[Pasted image 20220316101907.png]]
The big difference in an Deployment pipeline is that the whole process is automated. From uploading it to the repo and testing the build. Testing the automated process. Even up to deployment this where its different. Instead of deploying it to a test/production envoriment. Its straight deployed to the customer. 

So you think why would you do this? well there are some pros and cons to both of the CDS