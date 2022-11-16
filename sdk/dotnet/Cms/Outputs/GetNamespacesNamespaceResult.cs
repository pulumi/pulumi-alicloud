// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cms.Outputs
{

    [OutputType]
    public sealed class GetNamespacesNamespaceResult
    {
        /// <summary>
        /// Create the timestamp of the indicator warehouse.
        /// </summary>
        public readonly string CreateTime;
        /// <summary>
        /// Description of indicator warehouse.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The ID of the Namespace.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The timestamp of the last modification indicator warehouse.
        /// </summary>
        public readonly string ModifyTime;
        /// <summary>
        /// Indicator warehouse name.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// The ID of the Namespace.
        /// </summary>
        public readonly string NamespaceId;
        /// <summary>
        /// Data storage duration.
        /// </summary>
        public readonly string Specification;

        [OutputConstructor]
        private GetNamespacesNamespaceResult(
            string createTime,

            string description,

            string id,

            string modifyTime,

            string @namespace,

            string namespaceId,

            string specification)
        {
            CreateTime = createTime;
            Description = description;
            Id = id;
            ModifyTime = modifyTime;
            Namespace = @namespace;
            NamespaceId = namespaceId;
            Specification = specification;
        }
    }
}