Feature: Demoblaze E-commerce Functionality

#signup
@sanity
Scenario: User Registration
Given User is on the Demoblaze homepage
When User clicks on SignUP button
And User enters username  and password for signup

And User clicks signup button
Then User should see an alert "Sign up successful." and accept it

#login 
@sanity
Scenario: User Login and Product Purchase
Given User is on the Demoblaze homepage
When User clicks on Login button
And User enters Username  and Password for login
And User clicks login button
    
#  Contact and About us Page
@sanity
Scenario: Verify the Contact and About US Page
Given User is on the Demoblaze homepage
When User clicks on Contact
And User enters contact email and name 
And User enters message 
And User click on Send message

When User clicks on About us
And User clicks on Close button
 
#Selects product and complete the checking process   
@sanity
Scenario: Verify user selects product and complete the checking process
Given User is on the Demoblaze homepage
When User navigates to Phones category
And User selects Samsung galaxy s6
And User adds phone item to cart
    
When User goes back to home page
And User navigates to Laptops category
And User selects MacBook air
And User adds laptop item to cart
    
When User goes back to home page
And User navigates to Monitors category
And User selects Apple monitor24
And User adds monitor item to cart

When User clicks on Cart
And User clicks on Place Order
And User fills order details:
| Name          | Country | City     | Credit card | Month     | Year |
| Vishnu        | India   | Kurnool  | 1234567890  | September | 2025 |
And User clicks on Purchase
Then User should see an message "Thank you for your purchase!" and click OK





   


    