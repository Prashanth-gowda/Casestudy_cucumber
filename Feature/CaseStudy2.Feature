Feature: TestMeApp Login

Scenario Outline: TestMeApp Login Test
Given The Login page is opened
When Enter the username "<username>"
When Enters the password "<password>"
Then the home page is opened

Examples:
       |username|password|
       |maqwertu|ras@1358|
