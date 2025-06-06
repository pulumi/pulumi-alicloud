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
    public sealed class GetNasFileSystemsSystemResult
    {
        /// <summary>
        /// The capacity of nas file system.
        /// </summary>
        public readonly string Capacity;
        /// <summary>
        /// The create time of nas file system.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// The description of nas file system.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The filesystem id of nas file system.
        /// </summary>
        public readonly string FileSystemId;
        /// <summary>
        /// The type of nas file system.
        /// </summary>
        public readonly string FileSystemType;
        /// <summary>
        /// The ID of the Nas File System.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The size of metered.
        /// </summary>
        public readonly string MeteredSize;
        /// <summary>
        /// The domain of mount target.
        /// </summary>
        public readonly string MountTargetDomain;
        /// <summary>
        /// The status of mount target. Valid values: `Pending`, `Active`, `Inactive`,`Deleting`,`Invalid`.
        /// </summary>
        public readonly string MountTargetStatus;
        /// <summary>
        /// The name of nas file system.
        /// </summary>
        public readonly string NasFileSystemName;
        /// <summary>
        /// The ID of office site.
        /// </summary>
        public readonly string OfficeSiteId;
        /// <summary>
        /// The name of office site.
        /// </summary>
        public readonly string OfficeSiteName;
        /// <summary>
        /// The status of nas file system. Valid values: `Pending`, `Running`, `Stopped`,`Deleting`, `Deleted`, `Invalid`.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// The storage type of nas file system.
        /// </summary>
        public readonly string StorageType;
        /// <summary>
        /// Whether to support Acl.
        /// </summary>
        public readonly bool SupportAcl;
        /// <summary>
        /// The zone id of nas file system.
        /// </summary>
        public readonly string ZoneId;

        [OutputConstructor]
        private GetNasFileSystemsSystemResult(
            string capacity,

            string createTime,

            string description,

            string fileSystemId,

            string fileSystemType,

            string id,

            string meteredSize,

            string mountTargetDomain,

            string mountTargetStatus,

            string nasFileSystemName,

            string officeSiteId,

            string officeSiteName,

            string status,

            string storageType,

            bool supportAcl,

            string zoneId)
        {
            Capacity = capacity;
            CreateTime = createTime;
            Description = description;
            FileSystemId = fileSystemId;
            FileSystemType = fileSystemType;
            Id = id;
            MeteredSize = meteredSize;
            MountTargetDomain = mountTargetDomain;
            MountTargetStatus = mountTargetStatus;
            NasFileSystemName = nasFileSystemName;
            OfficeSiteId = officeSiteId;
            OfficeSiteName = officeSiteName;
            Status = status;
            StorageType = storageType;
            SupportAcl = supportAcl;
            ZoneId = zoneId;
        }
    }
}
