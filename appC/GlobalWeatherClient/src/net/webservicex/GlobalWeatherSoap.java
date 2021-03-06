/* ===================================================
 * Copyright 2012 Kousen IT, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ========================================================== */

package net.webservicex;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.4-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "GlobalWeatherSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GlobalWeatherSoap {


    /**
     * Get weather report for all major cities around the world.
     * 
     * @param countryName
     * @param cityName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetWeather", action = "http://www.webserviceX.NET/GetWeather")
    @WebResult(name = "GetWeatherResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetWeather", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetWeather")
    @ResponseWrapper(localName = "GetWeatherResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetWeatherResponse")
    public String getWeather(
        @WebParam(name = "CityName", targetNamespace = "http://www.webserviceX.NET")
        String cityName,
        @WebParam(name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        String countryName);

    /**
     * Get all major cities by country name(full / part).
     * 
     * @param countryName
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetCitiesByCountry", action = "http://www.webserviceX.NET/GetCitiesByCountry")
    @WebResult(name = "GetCitiesByCountryResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetCitiesByCountry", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetCitiesByCountry")
    @ResponseWrapper(localName = "GetCitiesByCountryResponse", targetNamespace = "http://www.webserviceX.NET", className = "net.webservicex.GetCitiesByCountryResponse")
    public String getCitiesByCountry(
        @WebParam(name = "CountryName", targetNamespace = "http://www.webserviceX.NET")
        String countryName);

}
