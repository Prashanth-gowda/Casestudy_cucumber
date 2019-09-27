Feature: No Items in cart

Scenario: User moves to cart without adding any items in it
Given Alex has registered into TestMeApp
When Alex search for a particular product like headphones
And try to proceed to payment without adding items to cart
Then TestMeApp doesn't display the cart icon