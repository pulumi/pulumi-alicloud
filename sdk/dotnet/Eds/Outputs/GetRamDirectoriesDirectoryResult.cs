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
    public sealed class GetRamDirectoriesDirectoryResult
    {
        /// <summary>
        /// The AD connectors.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRamDirectoriesDirectoryAdConnectorResult> AdConnectors;
        /// <summary>
        /// The CreateTime of resource.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The id of the custom security group.
        /// </summary>
        public readonly string CustomSecurityGroupId;
        /// <summary>
        /// The desktop access type.
        /// </summary>
        public readonly string DesktopAccessType;
        /// <summary>
        /// The desktop vpc endpoint.
        /// </summary>
        public readonly string DesktopVpcEndpoint;
        /// <summary>
        /// The directory type.
        /// </summary>
        public readonly string DirectoryType;
        /// <summary>
        /// The address of DNSAddress.
        /// </summary>
        public readonly ImmutableArray<string> DnsAddresses;
        /// <summary>
        /// The username of DNS.
        /// </summary>
        public readonly string DnsUserName;
        /// <summary>
        /// The name of the domain.
        /// </summary>
        public readonly string DomainName;
        /// <summary>
        /// The domain password.
        /// </summary>
        public readonly string DomainPassword;
        /// <summary>
        /// The username of the domain.
        /// </summary>
        public readonly string DomainUserName;
        /// <summary>
        /// Whether to enable admin access.
        /// </summary>
        public readonly bool EnableAdminAccess;
        /// <summary>
        /// Whether to enable cross desktop access.
        /// </summary>
        public readonly bool EnableCrossDesktopAccess;
        /// <summary>
        /// Whether enable internet access.
        /// </summary>
        public readonly bool EnableInternetAccess;
        /// <summary>
        /// The ids of filesystem.
        /// </summary>
        public readonly ImmutableArray<string> FileSystemIds;
        /// <summary>
        /// The ID of the Ram Directory.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The register log information.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetRamDirectoriesDirectoryLogResult> Logs;
        /// <summary>
        /// Whether to enable MFA.
        /// </summary>
        public readonly bool MfaEnabled;
        /// <summary>
        /// The ID of ram directory.
        /// </summary>
        public readonly string RamDirectoryId;
        /// <summary>
        /// The name of directory.
        /// </summary>
        public readonly string RamDirectoryName;
        /// <summary>
        /// Whether to enable SSO.
        /// </summary>
        public readonly bool SsoEnabled;
        /// <summary>
        /// The status of directory.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The address of sub DNS.
        /// </summary>
        public readonly ImmutableArray<string> SubDnsAddresses;
        /// <summary>
        /// The Name of the sub-domain.
        /// </summary>
        public readonly string SubDomainName;
        /// <summary>
        /// The trust password.
        /// </summary>
        public readonly string TrustPassword;
        /// <summary>
        /// The ID of the vpc.
        /// </summary>
        public readonly string VpcId;
        /// <summary>
        /// List of vSwitch IDs in the directory.
        /// </summary>
        public readonly ImmutableArray<string> VswitchIds;

        [OutputConstructor]
        private GetRamDirectoriesDirectoryResult(
            ImmutableArray<Outputs.GetRamDirectoriesDirectoryAdConnectorResult> adConnectors,

            string createTime,

            string customSecurityGroupId,

            string desktopAccessType,

            string desktopVpcEndpoint,

            string directoryType,

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

            ImmutableArray<Outputs.GetRamDirectoriesDirectoryLogResult> logs,

            bool mfaEnabled,

            string ramDirectoryId,

            string ramDirectoryName,

            bool ssoEnabled,

            string status,

            ImmutableArray<string> subDnsAddresses,

            string subDomainName,

            string trustPassword,

            string vpcId,

            ImmutableArray<string> vswitchIds)
        {
            AdConnectors = adConnectors;
            CreateTime = createTime;
            CustomSecurityGroupId = customSecurityGroupId;
            DesktopAccessType = desktopAccessType;
            DesktopVpcEndpoint = desktopVpcEndpoint;
            DirectoryType = directoryType;
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
            Logs = logs;
            MfaEnabled = mfaEnabled;
            RamDirectoryId = ramDirectoryId;
            RamDirectoryName = ramDirectoryName;
            SsoEnabled = ssoEnabled;
            Status = status;
            SubDnsAddresses = subDnsAddresses;
            SubDomainName = subDomainName;
            TrustPassword = trustPassword;
            VpcId = vpcId;
            VswitchIds = vswitchIds;
        }
    }
}
