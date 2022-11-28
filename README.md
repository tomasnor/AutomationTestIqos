## IQOS Automation Test Project

#### Reference: https://lt.iqos.com/lt


## Description:


#### Automated tests for four free chosen scenarios for a webpage [IQOS](https://lt.iqos.com/lt):
* Age verification form submitting;
* Language switch function;
* Adding the product to the cart;
* Removing product from the cart;


## Technologies:
* JAVA/Maven
#### Dependencies:
* TestNg
* Selenium
* Webdriver manager

### Test scenario Nr.1 Age verification form submitting:
#### Test case 1.1 The form is filled in when the age is over 18 years:


1. Open URL: https://lt.iqos.com/lt
2. Select the month of birth in dropdown menu: "Kovas"
3. Select the year of birth in dropdown menu: 2000
4. Click button "Patikrinti".

Expected result: After fulfilling age confirmation form we should be directed to the homepage.

#### Test case 1.2 The form is filled in when the age is less than 18 years:


1. Open URL: https://lt.iqos.com/lt
2. Select the month of birth in dropdown menu: "Balandis"
3. Select the year of birth in dropdown menu: 2011
4. Click button "Patikrinti".

Expected result: After fulfilling age confirmation form we shouldn't be directed to the homepage.
We should see the text which contains words: 
"Šioje Svetainėje pateikiama informacija apie gaminius, 
skirtus asmenims, vyresniems nei 18 metų."

### Test scenario Nr.2 Language switch function:
#### Test case 2.1 Language changing from Lithuanian to English:


1. Open URL: https://lt.iqos.com/lt
2. Confirm your age.
3. Go to the bottom of the main page and click on link "Lietuvių" in "Kalba" field.
4. Click option "English".

Expected result: Page language is switched from Lithuanian to English.


### Test scenario Nr.3 Adding the product to the cart:
#### Test case 3.1 Adding chosen product to the cart:

1. Open URL: https://lt.iqos.com/lt
2. Confirm your age.
3. Click link "E. parduotuvė" at main page menu.
4. Choose option "IQOS 3 DUO linija".
5. Choose option "Viso IQOS 3 DUO prekės"
6. Choose the product you want to add to the cart and click link.
7. Click button "Į krepšelį".

Expected result: The "mini cart" field at the right position of the
page appeared. It contains text that your product was added to the cart.
Mini cart contains exact product which you've chosen.

### Test scenario Nr.4 Remove product from the cart:
#### Test case 4.1 Removing added product from the cart:

1. Open URL: https://lt.iqos.com/lt
2. Confirm your age.
3. Click link "E. parduotuvė" at main page menu.
4. Choose option "IQOS 3 DUO linija".
5. Choose option "Viso IQOS 3 DUO prekės"
6. Choose the product you want to add to the cart and click link.
7. Click button "Į krepšelį".
8. Click image "cart" at the navigation menu.
9. Click link "Pašalinti" below the added product.

Expected result: The item removal was successful. 
The text which contains words "Jūsų krepšelis yra tuščias"
should be presented.