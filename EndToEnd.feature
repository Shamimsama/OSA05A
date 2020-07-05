Feature: EndToEnd Scenario

Scenario: validate martage rate for HSBC

Given Open browser
And Nevigate to URL
When User hoverOver on mortgage
And User click on mortgage rate
And User click on next HSBC Button
Then User should be able to see HSBC Bank Rate Page