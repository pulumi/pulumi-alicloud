// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAlidnsInstancesInstance {
    /**
     * @return DNS security level.
     * 
     */
    private final String dnsSecurity;
    /**
     * @return (Available in 1.124.1+) The domain name.
     * 
     */
    private final String domain;
    /**
     * @return Number of domain names bound.
     * 
     */
    private final String domainNumbers;
    /**
     * @return Id of the instance.
     * 
     */
    private final String id;
    /**
     * @return Id of the instance resource.
     * 
     */
    private final String instanceId;
    /**
     * @return (Available in 1.124.1+) The payment type of alidns instance.
     * 
     */
    private final String paymentType;
    /**
     * @return Paid package version.
     * 
     */
    private final String versionCode;
    /**
     * @return Paid package version name.
     * 
     */
    private final String versionName;

    @CustomType.Constructor
    private GetAlidnsInstancesInstance(
        @CustomType.Parameter("dnsSecurity") String dnsSecurity,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("domainNumbers") String domainNumbers,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceId") String instanceId,
        @CustomType.Parameter("paymentType") String paymentType,
        @CustomType.Parameter("versionCode") String versionCode,
        @CustomType.Parameter("versionName") String versionName) {
        this.dnsSecurity = dnsSecurity;
        this.domain = domain;
        this.domainNumbers = domainNumbers;
        this.id = id;
        this.instanceId = instanceId;
        this.paymentType = paymentType;
        this.versionCode = versionCode;
        this.versionName = versionName;
    }

    /**
     * @return DNS security level.
     * 
     */
    public String dnsSecurity() {
        return this.dnsSecurity;
    }
    /**
     * @return (Available in 1.124.1+) The domain name.
     * 
     */
    public String domain() {
        return this.domain;
    }
    /**
     * @return Number of domain names bound.
     * 
     */
    public String domainNumbers() {
        return this.domainNumbers;
    }
    /**
     * @return Id of the instance.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Id of the instance resource.
     * 
     */
    public String instanceId() {
        return this.instanceId;
    }
    /**
     * @return (Available in 1.124.1+) The payment type of alidns instance.
     * 
     */
    public String paymentType() {
        return this.paymentType;
    }
    /**
     * @return Paid package version.
     * 
     */
    public String versionCode() {
        return this.versionCode;
    }
    /**
     * @return Paid package version name.
     * 
     */
    public String versionName() {
        return this.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAlidnsInstancesInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dnsSecurity;
        private String domain;
        private String domainNumbers;
        private String id;
        private String instanceId;
        private String paymentType;
        private String versionCode;
        private String versionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAlidnsInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSecurity = defaults.dnsSecurity;
    	      this.domain = defaults.domain;
    	      this.domainNumbers = defaults.domainNumbers;
    	      this.id = defaults.id;
    	      this.instanceId = defaults.instanceId;
    	      this.paymentType = defaults.paymentType;
    	      this.versionCode = defaults.versionCode;
    	      this.versionName = defaults.versionName;
        }

        public Builder dnsSecurity(String dnsSecurity) {
            this.dnsSecurity = Objects.requireNonNull(dnsSecurity);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder domainNumbers(String domainNumbers) {
            this.domainNumbers = Objects.requireNonNull(domainNumbers);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        public Builder paymentType(String paymentType) {
            this.paymentType = Objects.requireNonNull(paymentType);
            return this;
        }
        public Builder versionCode(String versionCode) {
            this.versionCode = Objects.requireNonNull(versionCode);
            return this;
        }
        public Builder versionName(String versionName) {
            this.versionName = Objects.requireNonNull(versionName);
            return this;
        }        public GetAlidnsInstancesInstance build() {
            return new GetAlidnsInstancesInstance(dnsSecurity, domain, domainNumbers, id, instanceId, paymentType, versionCode, versionName);
        }
    }
}