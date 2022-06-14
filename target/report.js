$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/Flipkart.feature");
formatter.feature({
  "name": "flipkart automation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@flipart"
    }
  ]
});
formatter.scenario({
  "name": "try to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@flipart"
    },
    {
      "name": "@execution"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FlipkartCucumberPayment.launch_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user emter credentials for flipkart \"yuvarajsrec4@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "FlipkartCucumberPayment.user_emter_credentials_for_flipkart(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enter password",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});