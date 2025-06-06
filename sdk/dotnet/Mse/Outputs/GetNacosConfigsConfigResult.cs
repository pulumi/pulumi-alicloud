// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Mse.Outputs
{

    [OutputType]
    public sealed class GetNacosConfigsConfigResult
    {
        /// <summary>
        /// The name of the application.
        /// </summary>
        public readonly string AppName;
        /// <summary>
        /// The list of IP addresses where the beta release of the configuration is performed.
        /// </summary>
        public readonly string BetaIps;
        /// <summary>
        /// The content of the configuration.
        /// </summary>
        public readonly string Content;
        /// <summary>
        /// The ID of the data.
        /// </summary>
        public readonly string DataId;
        /// <summary>
        /// The description of the configuration.
        /// </summary>
        public readonly string Desc;
        /// <summary>
        /// The encryption key.
        /// </summary>
        public readonly string EncryptedDataKey;
        /// <summary>
        /// The ID of the group.
        /// </summary>
        public readonly string Group;
        /// <summary>
        /// The ID of the Nacos Config. It is formatted to `&lt;instance_id&gt;:&lt;namespace_id&gt;:&lt;data_id&gt;:&lt;group&gt;`.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The message digest of the configuration.
        /// </summary>
        public readonly string Md5;
        /// <summary>
        /// The tags of the configuration.
        /// </summary>
        public readonly string Tags;
        /// <summary>
        /// The format of the configuration. Supported formats include TEXT, JSON, and XML.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private GetNacosConfigsConfigResult(
            string appName,

            string betaIps,

            string content,

            string dataId,

            string desc,

            string encryptedDataKey,

            string group,

            string id,

            string md5,

            string tags,

            string type)
        {
            AppName = appName;
            BetaIps = betaIps;
            Content = content;
            DataId = dataId;
            Desc = desc;
            EncryptedDataKey = encryptedDataKey;
            Group = group;
            Id = id;
            Md5 = md5;
            Tags = tags;
            Type = type;
        }
    }
}
