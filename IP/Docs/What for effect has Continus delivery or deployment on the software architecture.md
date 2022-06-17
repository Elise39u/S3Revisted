# So what is the effect?
To start understanding the effect of the CI/CD pipelines. We first have to see what is our current plan for the project. With plan i meant what are we going to build. 

### The plan
![[Pasted image 20220323090810.png]]

The current plan is to start with the sketch above here. The idea for the click game is to work on a VUE frontend. From there if an user wants to go a new location, then a call is made to the backend.  There the backend checks if the given data is vailed. If it isnt the backend gives an error back. 

If it is vailed then the backend send it towards the database to see if its there. 2 cases happend here. The data cant be found and the database returns that. In this case the backend returns again an error. In case the data is found, then the database sends it back to the backend. From there the backend proces it and set it through to json. There it sends it back to the front end.

## CI/CD/CD pipeline?
To start were gonna look what it for effects it actually holds. Because the project is clear.  But already stated is that CI/CD is more something for your repos. To start im gonna tell what happends normaly 

Normally you made something or changed something in your code. The day comes to an end, and you sit there like time to commite. 
![[Pasted image 20220323091757.png]]
This is motly what happends then. No big deal right? That is true. Also why is the arrow red. Well that is for later. But you probably have not thought of cases like:
- what if it doesnt work?
- are there bugs? 
- does it still build?
Here is where the first step for the architechture comes what is gonna effect your project

### CI pipeline
Now its not really usefull here but just imagine that you are working in a team on this project. You have your userstory were you working on and think your done. You pushed it your made branch and think its fine i want it to merge to dev branch.
![[Pasted image 20220323093107.png]]
- Red is you own actions like commiting and pushing or wanting to merge
- Purple is the CI pipeline

Thats where the image comes in handy. Where the CI pipelines starts is also different for each project. But for the image just imagine it bening on the dev branch. Since we want to keep the dev branch as a working product. 

So lets say that you want to merge your branch into the Dev branch. Well at this point the CI pipeline is called. The CIpipeline has 2 stages and effects your product/software since in case of an error can refuse your merge. 

#### Build stage
On first your project is build. So for the sake of our project lets say that we added that a users location is update once they move locations in the backend. So you want to add it to the project. 

The maven build pipeline is gonna build your project. Lets say you missed a ; somewhere. Then the pipeline stops and gives you a detailed error of what happend. Lets say 8 out of 10 times it says what went wrong. Those other 2 times its guess work and headaches. 
![[Pasted image 20220323095356.png]]

So you putteed your fix in and the build is an success. Ofcourse there are stages where the there is no Test written yet. In that case you can igonre the UNIT test section. But as a good developer ofcourse we write test for what we make. Because we want to be sure that at least our code works. 

Dont count the fact of how users can still break your project. But also in a merge there is the chance that something breaks or gets overwritten on accident. Thats why we have a second stage. The testing stage. In this stage all the written tests are once runned and checked.

Why do we do this. Well as said in a merge we can by accident remove the wrong code. With this there is a chance that your test or code breaks. That why we run it. Like on the build stage in case of an error the code is rejected. On an succes its finally mergerd into the dev.

### Continous delivery pipeline
So lets say the image we used ealier with the scheme is now complete. There is still the option to continue with pipelines or stop here. But one thing is sure to be noticed: **Without CI you cant make a CD pipeline**.

So lets start with how would the pipelines look.
![[Pasted image 20220323103829.png]]

Its getting bigger and bigger i know but know we have an new piece added.  
- **Red** Is your own choice or actions like pushing or merging.
- **Purple** is the CI pipeline 
- **Green** is our Continus delivery pipeline 

So lets say as team your make the userstories. Then the day comes forward where we need to deploy. Have to say it can be either done earlier to test stuff around there out. But lets look at what happend here.

For the story lets say we want to deploy the Quarkus backend. The backend still works on the Dev repo and it comes time to merge it to the Master/Main repo. At that point both projects are going to be build. So as the story lets say we want to build the Quarkus api.

From here we gonna need JDK installed first. In case this fails the project is denied and send back to the dev repo. Why? well were needing JDK to run Quarkus. So we need to install it to make it run.  So if its fails why continue.

On succes were gonna continue to the deployment stage. In this stage were installing ubuntu on a docker machine. Case this fails then again it pushed back to the dev branch.  Since we dont want an broken envoriment. On succes its deployed to the production/testing envoriment. 

So what is left now. We still have continous deployment.
### Continous deployment.
![[Pasted image 20220323111109.png]]

Der is een ding dat er bij komt en dat is de gele lijn. In een continus deployment envoriment each and every change is deployed to the customer. So instead of an deployment to the production/testing envoriment its goes directly to the customer.

With this the customer can more regular check the product and also more regular give feedback. This can be used in the production cyle back and it repeats. I think most of the other effects are something i have discussed in 

- [[Pros and Cons of Continus Deployment]]
- [[Pros and Cons of Continus Delivery]] 

