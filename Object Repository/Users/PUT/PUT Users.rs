<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>PUT Users</name>
   <tag></tag>
   <elementGuidId>628c9daa-ac68-4873-bfab-d6ea1dd145e4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;name\&quot;: \&quot;Brazilian Alexander\&quot;,\n    \&quot;username\&quot;: \&quot;Braz\&quot;,\n    \&quot;email\&quot;: \&quot;Braz@april.biz\&quot;,\n    \&quot;address\&quot;: {\n      \&quot;street\&quot;: \&quot;Kubec Light\&quot;,\n      \&quot;suite\&quot;: \&quot;Apt. 556\&quot;,\n      \&quot;city\&quot;: \&quot;Gwenborough\&quot;,\n      \&quot;zipcode\&quot;: \&quot;92998-3874\&quot;,\n      \&quot;geo\&quot;: {\n        \&quot;lat\&quot;: \&quot;37.3159\&quot;,\n        \&quot;lng\&quot;: \&quot;81.1496\&quot;\n      }\n    },\n  \t\&quot;phone\&quot;: \&quot;1-990-736-8031 x56442\&quot;,\n    \&quot;website\&quot;: \&quot;hilgard.org\&quot;,\n    \&quot;company\&quot;: {\n      \&quot;name\&quot;: \&quot;Buffalo-Crona\&quot;,\n      \&quot;catchPhrase\&quot;: \&quot;Multi-layered client-server neural-net\&quot;,\n      \&quot;bs\&quot;: \&quot;Real-time e-markets\&quot;\n    }\n  }&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>c84f18cc-9e21-41f5-a431-bc317b4e7e29</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.3.5</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>PUT</restRequestMethod>
   <restUrl>http://jsonplaceholder.typicode.com/users/1</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
