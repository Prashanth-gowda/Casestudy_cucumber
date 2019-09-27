Feature: TesyMwAppp

Scenario Outline: Registration
Given The signup page is openeds
When  entes "<username>" as usernamee
When  entrs "<firstname>" as fisrt namee
When  entrs "<lastname>" as lastnamee
When  eners "<password>" as passworde
When  eters "<cpassword>" to confirm passworde
When  Select malee
When  entrs "<email>" as emaile
When  entrs "<mob>" as mobile numbere
When  enters "<dob>" as date of birthe
When  entrs "<Address>" as addresse
When  Select Security Questione
When  enter "<Answer>" as answer e
When  clicks registere
Then  registers successfullye

Examples:
 |username|firstname|lastname|password|cpassword|email             |mob    |dob       |Address  |Answer|
 |maqwertu|Prashant |Gowda   |ras@1358|ras@1358 |rashanth@gmail.com|6876499|05/06/1996|Karnataka|red   |  