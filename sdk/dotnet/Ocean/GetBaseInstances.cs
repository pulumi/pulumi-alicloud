// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ocean
{
    public static class GetBaseInstances
    {
        /// <summary>
        /// This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.203.0+.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Ocean.GetBaseInstances.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Ocean.GetBaseInstances.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Instance",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["oceanBaseInstanceId1"] = ids.Apply(getBaseInstancesResult =&gt; getBaseInstancesResult.Instances[0]?.Id),
        ///         ["oceanBaseInstanceId2"] = nameRegex.Apply(getBaseInstancesResult =&gt; getBaseInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetBaseInstancesResult> InvokeAsync(GetBaseInstancesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBaseInstancesResult>("alicloud:ocean/getBaseInstances:getBaseInstances", args ?? new GetBaseInstancesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.203.0+.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Ocean.GetBaseInstances.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Ocean.GetBaseInstances.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Instance",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["oceanBaseInstanceId1"] = ids.Apply(getBaseInstancesResult =&gt; getBaseInstancesResult.Instances[0]?.Id),
        ///         ["oceanBaseInstanceId2"] = nameRegex.Apply(getBaseInstancesResult =&gt; getBaseInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBaseInstancesResult> Invoke(GetBaseInstancesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBaseInstancesResult>("alicloud:ocean/getBaseInstances:getBaseInstances", args ?? new GetBaseInstancesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Ocean Base Instances of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.203.0+.
        /// 
        /// ## Example Usage
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ids = AliCloud.Ocean.GetBaseInstances.Invoke();
        /// 
        ///     var nameRegex = AliCloud.Ocean.GetBaseInstances.Invoke(new()
        ///     {
        ///         NameRegex = "^my-Instance",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["oceanBaseInstanceId1"] = ids.Apply(getBaseInstancesResult =&gt; getBaseInstancesResult.Instances[0]?.Id),
        ///         ["oceanBaseInstanceId2"] = nameRegex.Apply(getBaseInstancesResult =&gt; getBaseInstancesResult.Instances[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetBaseInstancesResult> Invoke(GetBaseInstancesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetBaseInstancesResult>("alicloud:ocean/getBaseInstances:getBaseInstances", args ?? new GetBaseInstancesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBaseInstancesArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Instance IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// OceanBase cluster ID.
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        /// <summary>
        /// OceanBase cluster name. The length is 1 to 20 English or Chinese characters. If this parameter is not specified, the default value is the InstanceId of the cluster.
        /// </summary>
        [Input("instanceName")]
        public string? InstanceName { get; set; }

        /// <summary>
        /// A regex string to filter results by Instance name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The ID of the enterprise resource group to which the instance resides.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The filter keyword for the query list.
        /// </summary>
        [Input("searchKey")]
        public string? SearchKey { get; set; }

        /// <summary>
        /// The status of the Instance. Value range: `PENDING_CREATE`, `ONLINE`, `TENANT_CREATING`, `TENANT_SPEC_MODIFYING`, `EXPANDING`, `REDUCING`, `SPEC_UPGRADING`, `DISK_UPGRADING`, `WHITE_LIST_MODIFYING`, `PARAMETER_MODIFYING`, `SSL_MODIFYING`, `PREPAID_EXPIRE_CLOSED`, `ARREARS_CLOSED`, `PENDING_DELETE`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetBaseInstancesArgs()
        {
        }
        public static new GetBaseInstancesArgs Empty => new GetBaseInstancesArgs();
    }

    public sealed class GetBaseInstancesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Instance IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// OceanBase cluster ID.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// OceanBase cluster name. The length is 1 to 20 English or Chinese characters. If this parameter is not specified, the default value is the InstanceId of the cluster.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// A regex string to filter results by Instance name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The ID of the enterprise resource group to which the instance resides.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The filter keyword for the query list.
        /// </summary>
        [Input("searchKey")]
        public Input<string>? SearchKey { get; set; }

        /// <summary>
        /// The status of the Instance. Value range: `PENDING_CREATE`, `ONLINE`, `TENANT_CREATING`, `TENANT_SPEC_MODIFYING`, `EXPANDING`, `REDUCING`, `SPEC_UPGRADING`, `DISK_UPGRADING`, `WHITE_LIST_MODIFYING`, `PARAMETER_MODIFYING`, `SSL_MODIFYING`, `PREPAID_EXPIRE_CLOSED`, `ARREARS_CLOSED`, `PENDING_DELETE`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetBaseInstancesInvokeArgs()
        {
        }
        public static new GetBaseInstancesInvokeArgs Empty => new GetBaseInstancesInvokeArgs();
    }


    [OutputType]
    public sealed class GetBaseInstancesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceId;
        public readonly string? InstanceName;
        public readonly ImmutableArray<Outputs.GetBaseInstancesInstanceResult> Instances;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly string? ResourceGroupId;
        public readonly string? SearchKey;
        public readonly string? Status;

        [OutputConstructor]
        private GetBaseInstancesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? instanceId,

            string? instanceName,

            ImmutableArray<Outputs.GetBaseInstancesInstanceResult> instances,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? resourceGroupId,

            string? searchKey,

            string? status)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            InstanceName = instanceName;
            Instances = instances;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            ResourceGroupId = resourceGroupId;
            SearchKey = searchKey;
            Status = status;
        }
    }
}
