$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckOut.feature");
formatter.feature({
  "line": 2,
  "name": "Feature check out",
  "description": "description feature",
  "id": "feature-check-out",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@CheckOut"
    }
  ]
});
formatter.before({
  "duration": 3397118100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User purchases 2 items until the order is successful",
  "description": "",
  "id": "feature-check-out;user-purchases-2-items-until-the-order-is-successful",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User sort product list by name z to a",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User pick item Sauce Labs Backpack",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User pick item sauce labs fleece jacket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click total item on basket",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "System display item list from cartpage",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click checkout button on cartpage",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User input \"Binta Wira\" as firstName and input \"Nasrullah\" as lastName and input \"66352\" as postalCode",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Verify total price is \"Total: $62.62\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User click finish button to checkout",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Display massage THANK YOU FOR YOUR ORDER",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyDisplay()"
});
formatter.result({
  "duration": 2130407400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 186774600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectProductContainer()"
});
formatter.result({
  "duration": 2101083300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket1()"
});
formatter.result({
  "duration": 2041240600,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickItemBasket2()"
});
formatter.result({
  "duration": 2048491900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.clickTotalBasket()"
});
formatter.result({
  "duration": 2057233600,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.getItemList()"
});
formatter.result({
  "duration": 2071948800,
  "status": "passed"
});
formatter.match({
  "location": "CartSteps.checkOutItem()"
});
formatter.result({
  "duration": 2096106600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Binta Wira",
      "offset": 12
    },
    {
      "val": "Nasrullah",
      "offset": 48
    },
    {
      "val": "66352",
      "offset": 82
    }
  ],
  "location": "InputInformationSteps.inputInformation(String,String,String)"
});
formatter.result({
  "duration": 3530841700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Total: $62.62",
      "offset": 23
    }
  ],
  "location": "CheckOutSteps.verifyTotalPrice(String)"
});
formatter.result({
  "duration": 2031197900,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutSteps.clickBtnFinish()"
});
formatter.result({
  "duration": 2064977100,
  "status": "passed"
});
formatter.match({
  "location": "CheckOutSteps.thanksMsg()"
});
formatter.result({
  "duration": 2031107000,
  "status": "passed"
});
});