// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.eds.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSimpleOfficeSitesSite {
    /**
     * @return The Internet Bandwidth Peak. It has been deprecated from version 1.142.0 and can be found in the new datasource alicloud_ecd_network_packages.
     * 
     * @deprecated
     * Field &#39;bandwidth&#39; has been deprecated from provider version 1.142.0.
     * 
     */
    @Deprecated /* Field 'bandwidth' has been deprecated from provider version 1.142.0. */
    private Integer bandwidth;
    /**
     * @return Cloud Enterprise Network Instance Id.
     * 
     */
    private String cenId;
    /**
     * @return Workspace Corresponds to the Security Office Network of IPv4 Segment.
     * 
     */
    private String cidrBlock;
    /**
     * @return Workspace Creation Time.
     * 
     */
    private String createTime;
    /**
     * @return Security Group ID.
     * 
     */
    private String customSecurityGroupId;
    /**
     * @return Connect to the Cloud Desktop Allows the Use of the Access Mode of. Possible Values: the Internet: Only Allows the Client to Public Cloud Desktop. Virtual Private Cloud (VPC): Only Allows in the Virtual Private Cloud (VPC) in the Client to Connect to the Cloud Desktop. Any: Not by Way of Limitation. Use Client to Connect to the Cloud Desktop When It Is Possible to Choose the Connection.
     * 
     */
    private String desktopAccessType;
    /**
     * @return The Desktop Vpc Endpoint.
     * 
     */
    private String desktopVpcEndpoint;
    /**
     * @return Enterprise Ad Corresponding DNS Address.
     * 
     */
    private List<String> dnsAddresses;
    /**
     * @return Easy-to-Use DNS Name.
     * 
     */
    private String dnsUserName;
    /**
     * @return Enterprise of Ad Domain Name.
     * 
     */
    private String domainName;
    /**
     * @return Domain of the User Who Will Administer This Target Application Password.
     * 
     */
    private String domainPassword;
    /**
     * @return The Domain Administrator&#39;s Username.
     * 
     */
    private String domainUserName;
    /**
     * @return Whether to Use Cloud Desktop User Empowerment of Local Administrator Permissions.
     * 
     */
    private Boolean enableAdminAccess;
    /**
     * @return Enable Cross-Desktop Access.
     * 
     */
    private Boolean enableCrossDesktopAccess;
    /**
     * @return Whether the Open Internet Access Function.
     * 
     * @deprecated
     * Field &#39;enable_internet_access&#39; has been deprecated from provider version 1.142.0.
     * 
     */
    @Deprecated /* Field 'enable_internet_access' has been deprecated from provider version 1.142.0. */
    private Boolean enableInternetAccess;
    /**
     * @return NAS File System ID.
     * 
     */
    private List<String> fileSystemIds;
    /**
     * @return The ID of the Simple Office Site.
     * 
     */
    private String id;
    /**
     * @return Whether to Enable Multi-Factor Authentication MFA.
     * 
     */
    private Boolean mfaEnabled;
    /**
     * @return Internet Access ID.
     * 
     */
    private String networkPackageId;
    /**
     * @return The Workspace ID.
     * 
     */
    private String officeSiteId;
    /**
     * @return Workspace Account System Type. Possible Values: Simple: Convenient Account. AD_CONNECTOR: Enterprise Ad Account.
     * 
     */
    private String officeSiteType;
    /**
     * @return The simple office site name.
     * 
     */
    private String simpleOfficeSiteName;
    /**
     * @return Whether to Enable Single Sign-on (SSO) for User-Based SSO.
     * 
     */
    private Boolean ssoEnabled;
    /**
     * @return Whether to Enable Single Sign-on (SSO) for User-Based SSO.
     * 
     */
    private Boolean ssoStatus;
    /**
     * @return Workspace State. Possible Values: Registering: Registered in the Registered: Registered.
     * 
     */
    private String status;
    /**
     * @return AD Subdomain of the DNS Address.
     * 
     */
    private List<String> subDnsAddresses;
    /**
     * @return AD Domain DNS Name.
     * 
     */
    private String subDomainName;
    /**
     * @return AD Trust Password.
     * 
     */
    private String trustPassword;
    /**
     * @return Security Office VPC ID.
     * 
     */
    private String vpcId;
    /**
     * @return The vswitch ids.
     * 
     */
    private List<String> vswitchIds;

    private GetSimpleOfficeSitesSite() {}
    /**
     * @return The Internet Bandwidth Peak. It has been deprecated from version 1.142.0 and can be found in the new datasource alicloud_ecd_network_packages.
     * 
     * @deprecated
     * Field &#39;bandwidth&#39; has been deprecated from provider version 1.142.0.
     * 
     */
    @Deprecated /* Field 'bandwidth' has been deprecated from provider version 1.142.0. */
    public Integer bandwidth() {
        return this.bandwidth;
    }
    /**
     * @return Cloud Enterprise Network Instance Id.
     * 
     */
    public String cenId() {
        return this.cenId;
    }
    /**
     * @return Workspace Corresponds to the Security Office Network of IPv4 Segment.
     * 
     */
    public String cidrBlock() {
        return this.cidrBlock;
    }
    /**
     * @return Workspace Creation Time.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return Security Group ID.
     * 
     */
    public String customSecurityGroupId() {
        return this.customSecurityGroupId;
    }
    /**
     * @return Connect to the Cloud Desktop Allows the Use of the Access Mode of. Possible Values: the Internet: Only Allows the Client to Public Cloud Desktop. Virtual Private Cloud (VPC): Only Allows in the Virtual Private Cloud (VPC) in the Client to Connect to the Cloud Desktop. Any: Not by Way of Limitation. Use Client to Connect to the Cloud Desktop When It Is Possible to Choose the Connection.
     * 
     */
    public String desktopAccessType() {
        return this.desktopAccessType;
    }
    /**
     * @return The Desktop Vpc Endpoint.
     * 
     */
    public String desktopVpcEndpoint() {
        return this.desktopVpcEndpoint;
    }
    /**
     * @return Enterprise Ad Corresponding DNS Address.
     * 
     */
    public List<String> dnsAddresses() {
        return this.dnsAddresses;
    }
    /**
     * @return Easy-to-Use DNS Name.
     * 
     */
    public String dnsUserName() {
        return this.dnsUserName;
    }
    /**
     * @return Enterprise of Ad Domain Name.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return Domain of the User Who Will Administer This Target Application Password.
     * 
     */
    public String domainPassword() {
        return this.domainPassword;
    }
    /**
     * @return The Domain Administrator&#39;s Username.
     * 
     */
    public String domainUserName() {
        return this.domainUserName;
    }
    /**
     * @return Whether to Use Cloud Desktop User Empowerment of Local Administrator Permissions.
     * 
     */
    public Boolean enableAdminAccess() {
        return this.enableAdminAccess;
    }
    /**
     * @return Enable Cross-Desktop Access.
     * 
     */
    public Boolean enableCrossDesktopAccess() {
        return this.enableCrossDesktopAccess;
    }
    /**
     * @return Whether the Open Internet Access Function.
     * 
     * @deprecated
     * Field &#39;enable_internet_access&#39; has been deprecated from provider version 1.142.0.
     * 
     */
    @Deprecated /* Field 'enable_internet_access' has been deprecated from provider version 1.142.0. */
    public Boolean enableInternetAccess() {
        return this.enableInternetAccess;
    }
    /**
     * @return NAS File System ID.
     * 
     */
    public List<String> fileSystemIds() {
        return this.fileSystemIds;
    }
    /**
     * @return The ID of the Simple Office Site.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether to Enable Multi-Factor Authentication MFA.
     * 
     */
    public Boolean mfaEnabled() {
        return this.mfaEnabled;
    }
    /**
     * @return Internet Access ID.
     * 
     */
    public String networkPackageId() {
        return this.networkPackageId;
    }
    /**
     * @return The Workspace ID.
     * 
     */
    public String officeSiteId() {
        return this.officeSiteId;
    }
    /**
     * @return Workspace Account System Type. Possible Values: Simple: Convenient Account. AD_CONNECTOR: Enterprise Ad Account.
     * 
     */
    public String officeSiteType() {
        return this.officeSiteType;
    }
    /**
     * @return The simple office site name.
     * 
     */
    public String simpleOfficeSiteName() {
        return this.simpleOfficeSiteName;
    }
    /**
     * @return Whether to Enable Single Sign-on (SSO) for User-Based SSO.
     * 
     */
    public Boolean ssoEnabled() {
        return this.ssoEnabled;
    }
    /**
     * @return Whether to Enable Single Sign-on (SSO) for User-Based SSO.
     * 
     */
    public Boolean ssoStatus() {
        return this.ssoStatus;
    }
    /**
     * @return Workspace State. Possible Values: Registering: Registered in the Registered: Registered.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return AD Subdomain of the DNS Address.
     * 
     */
    public List<String> subDnsAddresses() {
        return this.subDnsAddresses;
    }
    /**
     * @return AD Domain DNS Name.
     * 
     */
    public String subDomainName() {
        return this.subDomainName;
    }
    /**
     * @return AD Trust Password.
     * 
     */
    public String trustPassword() {
        return this.trustPassword;
    }
    /**
     * @return Security Office VPC ID.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }
    /**
     * @return The vswitch ids.
     * 
     */
    public List<String> vswitchIds() {
        return this.vswitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSimpleOfficeSitesSite defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer bandwidth;
        private String cenId;
        private String cidrBlock;
        private String createTime;
        private String customSecurityGroupId;
        private String desktopAccessType;
        private String desktopVpcEndpoint;
        private List<String> dnsAddresses;
        private String dnsUserName;
        private String domainName;
        private String domainPassword;
        private String domainUserName;
        private Boolean enableAdminAccess;
        private Boolean enableCrossDesktopAccess;
        private Boolean enableInternetAccess;
        private List<String> fileSystemIds;
        private String id;
        private Boolean mfaEnabled;
        private String networkPackageId;
        private String officeSiteId;
        private String officeSiteType;
        private String simpleOfficeSiteName;
        private Boolean ssoEnabled;
        private Boolean ssoStatus;
        private String status;
        private List<String> subDnsAddresses;
        private String subDomainName;
        private String trustPassword;
        private String vpcId;
        private List<String> vswitchIds;
        public Builder() {}
        public Builder(GetSimpleOfficeSitesSite defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidth = defaults.bandwidth;
    	      this.cenId = defaults.cenId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.createTime = defaults.createTime;
    	      this.customSecurityGroupId = defaults.customSecurityGroupId;
    	      this.desktopAccessType = defaults.desktopAccessType;
    	      this.desktopVpcEndpoint = defaults.desktopVpcEndpoint;
    	      this.dnsAddresses = defaults.dnsAddresses;
    	      this.dnsUserName = defaults.dnsUserName;
    	      this.domainName = defaults.domainName;
    	      this.domainPassword = defaults.domainPassword;
    	      this.domainUserName = defaults.domainUserName;
    	      this.enableAdminAccess = defaults.enableAdminAccess;
    	      this.enableCrossDesktopAccess = defaults.enableCrossDesktopAccess;
    	      this.enableInternetAccess = defaults.enableInternetAccess;
    	      this.fileSystemIds = defaults.fileSystemIds;
    	      this.id = defaults.id;
    	      this.mfaEnabled = defaults.mfaEnabled;
    	      this.networkPackageId = defaults.networkPackageId;
    	      this.officeSiteId = defaults.officeSiteId;
    	      this.officeSiteType = defaults.officeSiteType;
    	      this.simpleOfficeSiteName = defaults.simpleOfficeSiteName;
    	      this.ssoEnabled = defaults.ssoEnabled;
    	      this.ssoStatus = defaults.ssoStatus;
    	      this.status = defaults.status;
    	      this.subDnsAddresses = defaults.subDnsAddresses;
    	      this.subDomainName = defaults.subDomainName;
    	      this.trustPassword = defaults.trustPassword;
    	      this.vpcId = defaults.vpcId;
    	      this.vswitchIds = defaults.vswitchIds;
        }

        @CustomType.Setter
        public Builder bandwidth(Integer bandwidth) {
            if (bandwidth == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "bandwidth");
            }
            this.bandwidth = bandwidth;
            return this;
        }
        @CustomType.Setter
        public Builder cenId(String cenId) {
            if (cenId == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "cenId");
            }
            this.cenId = cenId;
            return this;
        }
        @CustomType.Setter
        public Builder cidrBlock(String cidrBlock) {
            if (cidrBlock == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "cidrBlock");
            }
            this.cidrBlock = cidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            if (createTime == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "createTime");
            }
            this.createTime = createTime;
            return this;
        }
        @CustomType.Setter
        public Builder customSecurityGroupId(String customSecurityGroupId) {
            if (customSecurityGroupId == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "customSecurityGroupId");
            }
            this.customSecurityGroupId = customSecurityGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder desktopAccessType(String desktopAccessType) {
            if (desktopAccessType == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "desktopAccessType");
            }
            this.desktopAccessType = desktopAccessType;
            return this;
        }
        @CustomType.Setter
        public Builder desktopVpcEndpoint(String desktopVpcEndpoint) {
            if (desktopVpcEndpoint == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "desktopVpcEndpoint");
            }
            this.desktopVpcEndpoint = desktopVpcEndpoint;
            return this;
        }
        @CustomType.Setter
        public Builder dnsAddresses(List<String> dnsAddresses) {
            if (dnsAddresses == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "dnsAddresses");
            }
            this.dnsAddresses = dnsAddresses;
            return this;
        }
        public Builder dnsAddresses(String... dnsAddresses) {
            return dnsAddresses(List.of(dnsAddresses));
        }
        @CustomType.Setter
        public Builder dnsUserName(String dnsUserName) {
            if (dnsUserName == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "dnsUserName");
            }
            this.dnsUserName = dnsUserName;
            return this;
        }
        @CustomType.Setter
        public Builder domainName(String domainName) {
            if (domainName == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "domainName");
            }
            this.domainName = domainName;
            return this;
        }
        @CustomType.Setter
        public Builder domainPassword(String domainPassword) {
            if (domainPassword == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "domainPassword");
            }
            this.domainPassword = domainPassword;
            return this;
        }
        @CustomType.Setter
        public Builder domainUserName(String domainUserName) {
            if (domainUserName == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "domainUserName");
            }
            this.domainUserName = domainUserName;
            return this;
        }
        @CustomType.Setter
        public Builder enableAdminAccess(Boolean enableAdminAccess) {
            if (enableAdminAccess == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "enableAdminAccess");
            }
            this.enableAdminAccess = enableAdminAccess;
            return this;
        }
        @CustomType.Setter
        public Builder enableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
            if (enableCrossDesktopAccess == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "enableCrossDesktopAccess");
            }
            this.enableCrossDesktopAccess = enableCrossDesktopAccess;
            return this;
        }
        @CustomType.Setter
        public Builder enableInternetAccess(Boolean enableInternetAccess) {
            if (enableInternetAccess == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "enableInternetAccess");
            }
            this.enableInternetAccess = enableInternetAccess;
            return this;
        }
        @CustomType.Setter
        public Builder fileSystemIds(List<String> fileSystemIds) {
            if (fileSystemIds == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "fileSystemIds");
            }
            this.fileSystemIds = fileSystemIds;
            return this;
        }
        public Builder fileSystemIds(String... fileSystemIds) {
            return fileSystemIds(List.of(fileSystemIds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "id");
            }
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder mfaEnabled(Boolean mfaEnabled) {
            if (mfaEnabled == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "mfaEnabled");
            }
            this.mfaEnabled = mfaEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder networkPackageId(String networkPackageId) {
            if (networkPackageId == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "networkPackageId");
            }
            this.networkPackageId = networkPackageId;
            return this;
        }
        @CustomType.Setter
        public Builder officeSiteId(String officeSiteId) {
            if (officeSiteId == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "officeSiteId");
            }
            this.officeSiteId = officeSiteId;
            return this;
        }
        @CustomType.Setter
        public Builder officeSiteType(String officeSiteType) {
            if (officeSiteType == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "officeSiteType");
            }
            this.officeSiteType = officeSiteType;
            return this;
        }
        @CustomType.Setter
        public Builder simpleOfficeSiteName(String simpleOfficeSiteName) {
            if (simpleOfficeSiteName == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "simpleOfficeSiteName");
            }
            this.simpleOfficeSiteName = simpleOfficeSiteName;
            return this;
        }
        @CustomType.Setter
        public Builder ssoEnabled(Boolean ssoEnabled) {
            if (ssoEnabled == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "ssoEnabled");
            }
            this.ssoEnabled = ssoEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder ssoStatus(Boolean ssoStatus) {
            if (ssoStatus == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "ssoStatus");
            }
            this.ssoStatus = ssoStatus;
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            if (status == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "status");
            }
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder subDnsAddresses(List<String> subDnsAddresses) {
            if (subDnsAddresses == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "subDnsAddresses");
            }
            this.subDnsAddresses = subDnsAddresses;
            return this;
        }
        public Builder subDnsAddresses(String... subDnsAddresses) {
            return subDnsAddresses(List.of(subDnsAddresses));
        }
        @CustomType.Setter
        public Builder subDomainName(String subDomainName) {
            if (subDomainName == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "subDomainName");
            }
            this.subDomainName = subDomainName;
            return this;
        }
        @CustomType.Setter
        public Builder trustPassword(String trustPassword) {
            if (trustPassword == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "trustPassword");
            }
            this.trustPassword = trustPassword;
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            if (vpcId == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "vpcId");
            }
            this.vpcId = vpcId;
            return this;
        }
        @CustomType.Setter
        public Builder vswitchIds(List<String> vswitchIds) {
            if (vswitchIds == null) {
              throw new MissingRequiredPropertyException("GetSimpleOfficeSitesSite", "vswitchIds");
            }
            this.vswitchIds = vswitchIds;
            return this;
        }
        public Builder vswitchIds(String... vswitchIds) {
            return vswitchIds(List.of(vswitchIds));
        }
        public GetSimpleOfficeSitesSite build() {
            final var _resultValue = new GetSimpleOfficeSitesSite();
            _resultValue.bandwidth = bandwidth;
            _resultValue.cenId = cenId;
            _resultValue.cidrBlock = cidrBlock;
            _resultValue.createTime = createTime;
            _resultValue.customSecurityGroupId = customSecurityGroupId;
            _resultValue.desktopAccessType = desktopAccessType;
            _resultValue.desktopVpcEndpoint = desktopVpcEndpoint;
            _resultValue.dnsAddresses = dnsAddresses;
            _resultValue.dnsUserName = dnsUserName;
            _resultValue.domainName = domainName;
            _resultValue.domainPassword = domainPassword;
            _resultValue.domainUserName = domainUserName;
            _resultValue.enableAdminAccess = enableAdminAccess;
            _resultValue.enableCrossDesktopAccess = enableCrossDesktopAccess;
            _resultValue.enableInternetAccess = enableInternetAccess;
            _resultValue.fileSystemIds = fileSystemIds;
            _resultValue.id = id;
            _resultValue.mfaEnabled = mfaEnabled;
            _resultValue.networkPackageId = networkPackageId;
            _resultValue.officeSiteId = officeSiteId;
            _resultValue.officeSiteType = officeSiteType;
            _resultValue.simpleOfficeSiteName = simpleOfficeSiteName;
            _resultValue.ssoEnabled = ssoEnabled;
            _resultValue.ssoStatus = ssoStatus;
            _resultValue.status = status;
            _resultValue.subDnsAddresses = subDnsAddresses;
            _resultValue.subDomainName = subDomainName;
            _resultValue.trustPassword = trustPassword;
            _resultValue.vpcId = vpcId;
            _resultValue.vswitchIds = vswitchIds;
            return _resultValue;
        }
    }
}