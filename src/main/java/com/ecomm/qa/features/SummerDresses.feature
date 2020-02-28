@SummerDresses
Feature: Cart functionality for summer dresses

Scenario: verify the summer dresses can be added to the cart
Given  user navigates to the site
And select "Summer Dresses" from the Dresses Tab
And add an item to the cart and proceed checkout
And sign in using email "ramanarv@gmail.com" and password "automation"

