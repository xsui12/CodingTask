### please replace "from", "to", "username", "password" with real account information in EmailService.java, in order for the email service to work.
### please use [this link](https://myaccount.google.com/lesssecureapps?pli=1&rapt=AEjHL4MHU7U4Gc-rC8AA0BRuwXOs_gnks3Zcw5232gACSXhIyCpar_ZBS_f7t9-IJeJadDjX4fjpwSsGEPKe0nnvn_5_3lB_Iw) to enable gmail to receive and send email notifications.
## Step 1: Build an Orders Service
1. Build a service that’s able to receive simple orders of shopping goods from the
command line
2. Apples cost 60 cents and oranges cost 25 cents
3. The service should be able to calculate that:
4. [ Apple, Apple, Orange, Apple ] => $2.05
5. Make reasonable assumptions about the inputs to your solution; for example,
candidates may take a list of strings as input
6. Add unit tests that validate your code

## Step 2: Simple offer
1. The shop decides to introduce two new offers
2. buy one get one free on Apples
3. 3 for the price of 2 on Oranges
4. Update your functions & unit tests accordingly

## Step 3: Build a Customer Notification Service
1. Customers complained that they don’t know if their orders made it through or not as
there is no notification of success
2. Build a service that listens for when orders are complete and sends a notification to
the customer regarding its status and estimated delivery time
3. The Mail service subscribes to events from the Orders service and publishes an
appropriate event that the customer (you) is able to read from the terminal
## Step 4: Limited Stock
1. Stock can now run out, this means that customers need to be notified that their order
failed

[GitHub](http://github.com)
