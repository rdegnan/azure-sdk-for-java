/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.CustomHeaderInterceptor;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.squareup.okhttp.OkHttpClient;
import java.util.UUID;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the WebSiteManagementClient class.
 */
public final class WebSiteManagementClientImpl extends AzureServiceClient implements WebSiteManagementClient {
    /** The URI used as the base for all cloud service requests. */
    private final String baseUri;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Gets Azure subscription credentials. */
    private ServiceClientCredentials credentials;

    /**
     * Gets Gets Azure subscription credentials.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

    /** Subscription Id. */
    private String subscriptionId;

    /**
     * Gets Subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /** API Version. */
    private String apiVersion;

    /**
     * Gets API Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean getGenerateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     */
    public void setGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
    }

    /**
     * Gets the CertificatesOperations object to access its operations.
     * @return the certificates value.
     */
    public CertificatesOperations getCertificates() {
        return new CertificatesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ClassicMobileServicesOperations object to access its operations.
     * @return the classicMobileServices value.
     */
    public ClassicMobileServicesOperations getClassicMobileServices() {
        return new ClassicMobileServicesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the DomainsOperations object to access its operations.
     * @return the domains value.
     */
    public DomainsOperations getDomains() {
        return new DomainsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the GlobalOperations object to access its operations.
     * @return the global value.
     */
    public GlobalOperations getGlobal() {
        return new GlobalOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the GlobalDomainRegistrationOperations object to access its operations.
     * @return the globalDomainRegistration value.
     */
    public GlobalDomainRegistrationOperations getGlobalDomainRegistration() {
        return new GlobalDomainRegistrationOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the GlobalResourceGroupsOperations object to access its operations.
     * @return the globalResourceGroups value.
     */
    public GlobalResourceGroupsOperations getGlobalResourceGroups() {
        return new GlobalResourceGroupsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the HostingEnvironmentsOperations object to access its operations.
     * @return the hostingEnvironments value.
     */
    public HostingEnvironmentsOperations getHostingEnvironments() {
        return new HostingEnvironmentsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ManagedHostingEnvironmentsOperations object to access its operations.
     * @return the managedHostingEnvironments value.
     */
    public ManagedHostingEnvironmentsOperations getManagedHostingEnvironments() {
        return new ManagedHostingEnvironmentsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ProviderOperations object to access its operations.
     * @return the provider value.
     */
    public ProviderOperations getProvider() {
        return new ProviderOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the ServerFarmsOperations object to access its operations.
     * @return the serverFarms value.
     */
    public ServerFarmsOperations getServerFarms() {
        return new ServerFarmsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the SitesOperations object to access its operations.
     * @return the sites value.
     */
    public SitesOperations getSites() {
        return new SitesOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the TopLevelDomainsOperations object to access its operations.
     * @return the topLevelDomains value.
     */
    public TopLevelDomainsOperations getTopLevelDomains() {
        return new TopLevelDomainsOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Gets the UsageOperations object to access its operations.
     * @return the usage value.
     */
    public UsageOperations getUsage() {
        return new UsageOperationsImpl(this.retrofitBuilder.build(), this);
    }

    /**
     * Initializes an instance of WebSiteManagementClient client.
     */
    public WebSiteManagementClientImpl() {
        this("https://management.azure.com");
    }

    /**
     * Initializes an instance of WebSiteManagementClient client.
     *
     * @param baseUri the base URI of the host
     */
    public WebSiteManagementClientImpl(String baseUri) {
        this(baseUri, null);
    }

    /**
     * Initializes an instance of WebSiteManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public WebSiteManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of WebSiteManagementClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public WebSiteManagementClientImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of WebSiteManagementClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public WebSiteManagementClientImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    private void initialize() {
        this.apiVersion = "2015-08-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        if (this.credentials != null) {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        this.retrofitBuilder.baseUrl(baseUri);
    }
}