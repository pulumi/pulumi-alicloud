// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eds.Outputs
{

    [OutputType]
    public sealed class GetSimpleOfficeSitesSiteResult
    {
        /// <summary>
        /// The Internet Bandwidth Peak. It has been deprecated from version 1.142.0 and can be found in the new datasource alicloud_ecd_network_packages.
        /// </summary>
        public readonly int Bandwidth;
        /// <summary>
        /// Cloud Enterprise Network Instance Id.
        /// </summary>
        public readonly string CenId;
        /// <summary>
        /// Workspace Corresponds to the Security Office Network of IPv4 Segment.
        /// </summary>
        public readonly string CidrBlock;
        /// <summary>
        /// Workspace Creation Time.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Security Group ID.
        /// </summary>
        public readonly string CustomSecurityGroupId;
        /// <summary>
        /// Connect to the Cloud Desktop Allows the Use of the Access Mode of. Possible Values: the Internet: Only Allows the Client to Public Cloud Desktop. Virtual Private Cloud (VPC): Only Allows in the Virtual Private Cloud (VPC) in the Client to Connect to the Cloud Desktop. Any: Not by Way of Limitation. Use Client to Connect to the Cloud Desktop When It Is Possible to Choose the Connection.
        /// </summary>
        public readonly string DesktopAccessType;
        /// <summary>
        /// The Desktop Vpc Endpoint.
        /// </summary>
        public readonly string DesktopVpcEndpoint;
        /// <summary>
        /// Enterprise Ad Corresponding DNS Address.
        /// </summary>
        public readonly ImmutableArray<string> DnsAddresses;
        /// <summary>
        /// Easy-to-Use DNS Name.
        /// </summary>
        public readonly string DnsUserName;
        /// <summary>
        /// Enterprise of Ad Domain Name.
        /// </summary>
        public readonly string DomainName;
        /// <summary>
        /// Domain of the User Who Will Administer This Target Application Password.
        /// </summary>
        public readonly string DomainPassword;
        /// <summary>
        /// The Domain Administrator's Username.
        /// </summary>
        public readonly string DomainUserName;
        /// <summary>
        /// Whether to Use Cloud Desktop User Empowerment of Local Administrator Permissions.
        /// </summary>
        public readonly bool EnableAdminAccess;
        /// <summary>
        /// Enable Cross-Desktop Access.
        /// </summary>
        public readonly bool EnableCrossDesktopAccess;
        /// <summary>
        /// Whether the Open Internet Access Function.
        /// </summary>
        public readonly bool EnableInternetAccess;
        /// <summary>
        /// NAS File System ID.
        /// </summary>
        public readonly ImmutableArray<string> FileSystemIds;
        /// <summary>
        /// The ID of the Simple Office Site.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Whether to Enable Multi-Factor Authentication MFA.
        /// </summary>
        public readonly bool MfaEnabled;
        /// <summary>
        /// Internet Access ID.
        /// </summary>
        public readonly string NetworkPackageId;
        /// <summary>
        /// The Workspace ID.
        /// </summary>
        public readonly string OfficeSiteId;
        /// <summary>
        /// Workspace Account System Type. Possible Values: Simple: Convenient Account. AD_CONNECTOR: Enterprise Ad Account.
        /// </summary>
        public readonly string OfficeSiteType;
        /// <summary>
        /// The simple office site name.
        /// </summary>
        public readonly string SimpleOfficeSiteName;
        /// <summary>
        /// Whether to Enable Single Sign-on (SSO) for User-Based SSO.
        /// </summary>
        public readonly bool SsoEnabled;
        /// <summary>
        /// Whether to Enable Single Sign-on (SSO) for User-Based SSO.
        /// </summary>
        public readonly bool SsoStatus;
        /// <summary>
        /// Workspace State. Possible Values: Registering: Registered in the Registered: Registered.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// AD Subdomain of the DNS Address.
        /// </summary>
        public readonly ImmutableArray<string> SubDnsAddresses;
        /// <summary>
        /// AD Domain DNS Name.
        /// </summary>
        public readonly string SubDomainName;
        /// <summary>
        /// AD Trust Password.
        /// </summary>
        public readonly string TrustPassword;
        /// <summary>
        /// Security Office VPC ID.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// The vswitch ids.
        /// </summary>
        public readonly ImmutableArray<string> VswitchIds;

        [OutputConstructor]
        private GetSimpleOfficeSitesSiteResult(
            int bandwidth,

            string cenId,

            string cidrBlock,

            string createTime,

            string customSecurityGroupId,

            string desktopAccessType,

            string desktopVpcEndpoint,

            ImmutableArray<string> dnsAddresses,

            string dnsUserName,

            string domainName,

            string domainPassword,

            string domainUserName,

            bool enableAdminAccess,

            bool enableCrossDesktopAccess,

            bool enableInternetAccess,

            ImmutableArray<string> fileSystemIds,

            string id,

            bool mfaEnabled,

            string networkPackageId,

            string officeSiteId,

            string officeSiteType,

            string simpleOfficeSiteName,

            bool ssoEnabled,

            bool ssoStatus,

            string status,

            ImmutableArray<string> subDnsAddresses,

            string subDomainName,

            string trustPassword,

            string vpcId,

            ImmutableArray<string> vswitchIds)
        {
            Bandwidth = bandwidth;
            CenId = cenId;
            CidrBlock = cidrBlock;
            CreateTime = createTime;
            CustomSecurityGroupId = customSecurityGroupId;
            DesktopAccessType = desktopAccessType;
            DesktopVpcEndpoint = desktopVpcEndpoint;
            DnsAddresses = dnsAddresses;
            DnsUserName = dnsUserName;
            DomainName = domainName;
            DomainPassword = domainPassword;
            DomainUserName = domainUserName;
            EnableAdminAccess = enableAdminAccess;
            EnableCrossDesktopAccess = enableCrossDesktopAccess;
            EnableInternetAccess = enableInternetAccess;
            FileSystemIds = fileSystemIds;
            Id = id;
            MfaEnabled = mfaEnabled;
            NetworkPackageId = networkPackageId;
            OfficeSiteId = officeSiteId;
            OfficeSiteType = officeSiteType;
            SimpleOfficeSiteName = simpleOfficeSiteName;
            SsoEnabled = ssoEnabled;
            SsoStatus = ssoStatus;
            Status = status;
            SubDnsAddresses = subDnsAddresses;
            SubDomainName = subDomainName;
            TrustPassword = trustPassword;
            VpcId = vpcId;
            VswitchIds = vswitchIds;
        }
    }
}
