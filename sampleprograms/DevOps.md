Explain the “Shift left to reduce failure” concept in DevOps?

Explain the architecture of Jenkins?

Explain IaaS, PaaS ?

What is Blue/Green Deployment Pattern?


How can you ensure a script runs every time repository gets new commits through git push?
**Pre-receive hook:** This hook is invoked before the references are updated when commits are being pushed. This hook is useful in ensuring the scripts related to enforcing development policies are run.
**Update hook:** This hook triggers the script to run before any updates are actually made. This hook is called once for every commit which has been pushed to the repository.
**Post-receive hook:** This hook helps trigger the script after the updates or changes have been accepted by the destination repository. This hook is ideal for configuring deployment scripts, any continuous integration-based scripts or email notifications process to the team, etc.



** Docker **
1. virtualization vs containerization ?
2. Explain Simple Dockerfile ?
3. Docker Lifecycle ?
4.  Is it a good practice to run stateful applications on Docker?
5. Are you aware of load balancing across containers and hosts? How does it work?
While using docker service with multiple containers across different hosts, you come across the need to load balance the incoming traffic. Load balancing and HAProxy is basically used to balance the incoming traffic across different available(healthy) containers. If one container crashes, another container should automatically start running and the traffic should be re-routed to this new running container. Load balancing and HAProxy works around this concept.
