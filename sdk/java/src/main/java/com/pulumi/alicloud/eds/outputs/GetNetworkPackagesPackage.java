// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetNetworkPackagesPackage {
    /**
     * @return The bandwidth of package.
     * 
     */
    private final Integer bandwidth;
    /**
     * @return The creation time of network package.
     * 
     */
    private final String createTime;
    /**
     * @return The public IP address list of the network packet.
     * 
     */
    private final List<String> eipAddresses;
    /**
     * @return The expired time of package.
     * 
     */
    private final String expiredTime;
    /**
     * @return The ID of the Network Package.
     * 
     */
    private final String id;
    /**
     * @return The internet charge type  of  package.
     * 
     */
    private final String internetChargeType;
    /**
     * @return The ID of network package.
     * 
     */
    private final String networkPackageId;
    /**
     * @return The ID of office site.
     * 
     */
    private final String officeSiteId;
    /**
     * @return The name of office site.
     * 
     */
    private final String officeSiteName;
    /**
     * @return The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
     * 
     */
    private final String status;

    @CustomType.Constructor
    private GetNetworkPackagesPackage(
        @CustomType.Parameter("bandwidth") Integer bandwidth,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("eipAddresses") List<String> eipAddresses,
        @CustomType.Parameter("expiredTime") String expiredTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("internetChargeType") String internetChargeType,
        @CustomType.Parameter("networkPackageId") String networkPackageId,
        @CustomType.Parameter("officeSiteId") String officeSiteId,
        @CustomType.Parameter("officeSiteName") String officeSiteName,
        @CustomType.Parameter("status") String status) {
        this.bandwidth = bandwidth;
        this.createTime = createTime;
        this.eipAddresses = eipAddresses;
        this.expiredTime = expiredTime;
        this.id = id;
        this.internetChargeType = internetChargeType;
        this.networkPackageId = networkPackageId;
        this.officeSiteId = officeSiteId;
        this.officeSiteName = officeSiteName;
        this.status = status;
    }

    /**
     * @return The bandwidth of package.
     * 
     */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return The creation time of network package.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The public IP address list of the network packet.
     * 
     */
    public List<String> eipAddresses() {
        return this.eipAddresses;
    }
    /**
     * @return The expired time of package.
     * 
     */
    public String expiredTime() {
        return this.expiredTime;
    }
    /**
     * @return The ID of the Network Package.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The internet charge type  of  package.
     * 
     */
    public String internetChargeType() {
        return this.internetChargeType;
    }
    /**
     * @return The ID of network package.
     * 
     */
    public String networkPackageId() {
        return this.networkPackageId;
    }
    /**
     * @return The ID of office site.
     * 
     */
    public String officeSiteId() {
        return this.officeSiteId;
    }
    /**
     * @return The name of office site.
     * 
     */
    public String officeSiteName() {
        return this.officeSiteName;
    }
    /**
     * @return The status of network package. Valid values: `Creating`, `InUse`, `Releasing`,`Released`.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkPackagesPackage defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer bandwidth;
        private String createTime;
        private List<String> eipAddresses;
        private String expiredTime;
        private String id;
        private String internetChargeType;
        private String networkPackageId;
        private String officeSiteId;
        private String officeSiteName;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkPackagesPackage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.createTime = defaults.createTime;
    	      this.eipAddresses = defaults.eipAddresses;
    	      this.expiredTime = defaults.expiredTime;
    	      this.id = defaults.id;
    	      this.internetChargeType = defaults.internetChargeType;
    	      this.networkPackageId = defaults.networkPackageId;
    	      this.officeSiteId = defaults.officeSiteId;
    	      this.officeSiteName = defaults.officeSiteName;
    	      this.status = defaults.status;
        }

        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = Objects.requireNonNull(bandwidth);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder eipAddresses(List<String> eipAddresses) {
            this.eipAddresses = Objects.requireNonNull(eipAddresses);
            return this;
        }
        public Builder eipAddresses(String... eipAddresses) {
            return eipAddresses(List.of(eipAddresses));
        }
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = Objects.requireNonNull(expiredTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder internetChargeType(String internetChargeType) {
            this.internetChargeType = Objects.requireNonNull(internetChargeType);
            return this;
        }
        public Builder networkPackageId(String networkPackageId) {
            this.networkPackageId = Objects.requireNonNull(networkPackageId);
            return this;
        }
        public Builder officeSiteId(String officeSiteId) {
            this.officeSiteId = Objects.requireNonNull(officeSiteId);
            return this;
        }
        public Builder officeSiteName(String officeSiteName) {
            this.officeSiteName = Objects.requireNonNull(officeSiteName);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public GetNetworkPackagesPackage build() {
            return new GetNetworkPackagesPackage(bandwidth, createTime, eipAddresses, expiredTime, id, internetChargeType, networkPackageId, officeSiteId, officeSiteName, status);
        }
    }
}