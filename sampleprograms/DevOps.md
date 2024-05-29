DevOps
-------
* Explain the “Shift left to reduce failure” concept in DevOps?
* Explain the architecture of Jenkins?
* Explain IaaS, PaaS ?
* What is Blue/Green Deployment Pattern?
* How can you ensure a script runs every time repository gets new commits through git push?
  * **Pre-receive hook:** This hook is invoked before the references are updated when commits are being pushed. This hook is useful in ensuring the scripts related to enforcing development policies are run.
  * **Update hook:** This hook triggers the script to run before any updates are actually made. This hook is called once for every commit which has been pushed to the repository.
  * **Post-receive hook:** This hook helps trigger the script after the updates or changes have been accepted by the destination repository. This hook is ideal for configuring deployment scripts, any continuous integration-based scripts or           email notifications process to the team, etc.
 
 * Sort Arrya using BubbleSort
 * ![image](https://github.com/gbk27/java8/assets/42496600/03b1eb4b-5e85-48a6-a183-7ff14921171d)




Docker
------
1. virtualization vs containerization ?
2. Explain Simple Dockerfile ?
3. Docker Lifecycle ?
4.  Is it a good practice to run stateful applications on Docker?
5. Are you aware of load balancing across containers and hosts? How does it work?
While using docker service with multiple containers across different hosts, you come across the need to load balance the incoming traffic. Load balancing and HAProxy is basically used to balance the incoming traffic across different available(healthy) containers. If one container crashes, another container should automatically start running and the traffic should be re-routed to this new running container. Load balancing and HAProxy works around this concept.


Jenkins
--------

What are the Scopes of Jenkins Credentials?
Jenkins credentials can be of one of the two scopes - Global & System

Global - the credential will be usable across all the jobs configured in the Jenkins instance (i.e. for all jobs). This is more suited for user Jobs (i.e. for the freestyle, pipeline, or other jobs) to authenticate itself with target services/infrastructures to accomplish the purpose of the job)

System - This is a special scope that will allow the Jenkins itself (i.e. the core Jenkins functionalities & some installed plugins) to authenticate itself to external services/infrastructures to perform some defined tasks. E.g. sending emails, etc.
