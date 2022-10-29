#Author: your.email@your.domain.com

Feature: Cocktail Ordering

  As Romeo, I want to offer a drink to Juliette so that we can discuss together (and maybe more).
  
  Scenario: Creating an empty order  
  Given Romeo who wants to buy a drink  
  When  an order is declared for Juliette  
  Then  there is no cocktail in the order