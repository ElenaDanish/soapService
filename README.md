# soapService

1) Запустить скрипт в БД postgres. 
2) Собрать проект
3) После запуска перейти http://localhost:8099/Service и открыть wsdl 
4) Создать проект в SOAP UI с wsdl http://localhost:8099/Service/ServiceInsurer?wsdl
5) Проверить работу сервиса с помощью одного из рег. номеров 0201001539, 4202005432 или 3808006267

Пример запроса

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ser="http://service.ws.demo/">
   <soapenv:Header/>
   <soapenv:Body>
      <ser:getInsurerData>
         <ser:regNum>0201001539</ser:regNum>
      </ser:getInsurerData>
   </soapenv:Body>
</soapenv:Envelope>

Пример ответа

<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
   <soap:Body>
      <ns1:getInsurerDataResponse xmlns:ns1="http://service.ws.demo/">
         <insurer xmlns:ns2="http://service.ws.demo/">
            <regNum>0201001539</regNum>
            <regNumPf>456466466464</regNumPf>
            <state>Зарегистрирован</state>
            <fssDepartmentCode>0201</fssDepartmentCode>
         </insurer>
      </ns1:getInsurerDataResponse>
   </soap:Body>
</soap:Envelope>
