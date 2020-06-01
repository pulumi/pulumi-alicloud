// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Kms
{
    public static class GetKeyVersions
    {
        /// <summary>
        /// This data source provides a list of KMS KeyVersions in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; NOTE: Available in v1.85.0+
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var alicloudKmsKeyVersionsDs = Output.Create(AliCloud.Kms.GetKeyVersions.InvokeAsync(new AliCloud.Kms.GetKeyVersionsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "d89e8a53-b708-41aa-8c67-6873axxx",
        ///             },
        ///             KeyId = "08438c-b4d5-4d05-928c-07b7xxxx",
        ///         }));
        ///         this.AllVersions = alicloudKmsKeyVersionsDs.Apply(alicloudKmsKeyVersionsDs =&gt; alicloudKmsKeyVersionsDs.Versions);
        ///     }
        /// 
        ///     [Output("allVersions")]
        ///     public Output&lt;string&gt; AllVersions { get; set; }
        /// }
        /// ```
        /// 
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKeyVersionsResult> InvokeAsync(GetKeyVersionsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetKeyVersionsResult>("alicloud:kms/getKeyVersions:getKeyVersions", args ?? new GetKeyVersionsArgs(), options.WithVersion());
    }


    public sealed class GetKeyVersionsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of KMS KeyVersion IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The id of kms key.
        /// </summary>
        [Input("keyId", required: true)]
        public string KeyId { get; set; } = null!;

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetKeyVersionsArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetKeyVersionsResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of KMS KeyVersion IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// ID of the key.
        /// </summary>
        public readonly string KeyId;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of KMS KeyVersions. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetKeyVersionsVersionResult> Versions;

        [OutputConstructor]
        private GetKeyVersionsResult(
            string id,

            ImmutableArray<string> ids,

            string keyId,

            string? outputFile,

            ImmutableArray<Outputs.GetKeyVersionsVersionResult> versions)
        {
            Id = id;
            Ids = ids;
            KeyId = keyId;
            OutputFile = outputFile;
            Versions = versions;
        }
    }
}