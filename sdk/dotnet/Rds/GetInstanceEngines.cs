// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static class GetInstanceEngines
    {
        /// <summary>
        /// This data source provides the RDS instance engines resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.46.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resources = AliCloud.Rds.GetInstanceEngines.Invoke(new()
        ///     {
        ///         InstanceChargeType = "PostPaid",
        ///         Engine = "MySQL",
        ///         EngineVersion = "5.6",
        ///         OutputFile = "./engines.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbCategory"] = resources.Apply(getInstanceEnginesResult =&gt; getInstanceEnginesResult.InstanceEngines[0]?.Category),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstanceEnginesResult> InvokeAsync(GetInstanceEnginesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceEnginesResult>("alicloud:rds/getInstanceEngines:getInstanceEngines", args ?? new GetInstanceEnginesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the RDS instance engines resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.46.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resources = AliCloud.Rds.GetInstanceEngines.Invoke(new()
        ///     {
        ///         InstanceChargeType = "PostPaid",
        ///         Engine = "MySQL",
        ///         EngineVersion = "5.6",
        ///         OutputFile = "./engines.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbCategory"] = resources.Apply(getInstanceEnginesResult =&gt; getInstanceEnginesResult.InstanceEngines[0]?.Category),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceEnginesResult> Invoke(GetInstanceEnginesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceEnginesResult>("alicloud:rds/getInstanceEngines:getInstanceEngines", args ?? new GetInstanceEnginesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the RDS instance engines resource available info of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.46.0+
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var resources = AliCloud.Rds.GetInstanceEngines.Invoke(new()
        ///     {
        ///         InstanceChargeType = "PostPaid",
        ///         Engine = "MySQL",
        ///         EngineVersion = "5.6",
        ///         OutputFile = "./engines.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbCategory"] = resources.Apply(getInstanceEnginesResult =&gt; getInstanceEnginesResult.InstanceEngines[0]?.Category),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceEnginesResult> Invoke(GetInstanceEnginesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceEnginesResult>("alicloud:rds/getInstanceEngines:getInstanceEngines", args ?? new GetInstanceEnginesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceEnginesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
        /// </summary>
        [Input("category")]
        public string? Category { get; set; }

        /// <summary>
        /// The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
        /// </summary>
        [Input("dbInstanceStorageType")]
        public string? DbInstanceStorageType { get; set; }

        /// <summary>
        /// Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
        /// </summary>
        [Input("engine")]
        public string? Engine { get; set; }

        /// <summary>
        /// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public string? EngineVersion { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public string? InstanceChargeType { get; set; }

        /// <summary>
        /// Whether to show multi available zone. Default false to not show multi availability zone.
        /// </summary>
        [Input("multiZone")]
        public bool? MultiZone { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi up`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Input("zoneId")]
        public string? ZoneId { get; set; }

        public GetInstanceEnginesArgs()
        {
        }
        public static new GetInstanceEnginesArgs Empty => new GetInstanceEnginesArgs();
    }

    public sealed class GetInstanceEnginesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
        /// </summary>
        [Input("category")]
        public Input<string>? Category { get; set; }

        /// <summary>
        /// The DB instance storage space required by the user. Valid values: "cloud_ssd", "local_ssd", "cloud_essd", "cloud_essd2", "cloud_essd3".
        /// </summary>
        [Input("dbInstanceStorageType")]
        public Input<string>? DbInstanceStorageType { get; set; }

        /// <summary>
        /// Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "MariaDB". If not set, it will match all of engines.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
        /// </summary>
        [Input("instanceChargeType")]
        public Input<string>? InstanceChargeType { get; set; }

        /// <summary>
        /// Whether to show multi available zone. Default false to not show multi availability zone.
        /// </summary>
        [Input("multiZone")]
        public Input<bool>? MultiZone { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi up`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The Zone to launch the DB instance.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public GetInstanceEnginesInvokeArgs()
        {
        }
        public static new GetInstanceEnginesInvokeArgs Empty => new GetInstanceEnginesInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceEnginesResult
    {
        /// <summary>
        /// DB Instance category.
        /// </summary>
        public readonly string? Category;
        public readonly string? DbInstanceStorageType;
        /// <summary>
        /// Database type.
        /// </summary>
        public readonly string? Engine;
        /// <summary>
        /// DB Instance version.
        /// </summary>
        public readonly string? EngineVersion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of engines.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceChargeType;
        /// <summary>
        /// A list of Rds available resource. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceEnginesInstanceEngineResult> InstanceEngines;
        public readonly bool? MultiZone;
        public readonly string? OutputFile;
        public readonly string? ZoneId;

        [OutputConstructor]
        private GetInstanceEnginesResult(
            string? category,

            string? dbInstanceStorageType,

            string? engine,

            string? engineVersion,

            string id,

            ImmutableArray<string> ids,

            string? instanceChargeType,

            ImmutableArray<Outputs.GetInstanceEnginesInstanceEngineResult> instanceEngines,

            bool? multiZone,

            string? outputFile,

            string? zoneId)
        {
            Category = category;
            DbInstanceStorageType = dbInstanceStorageType;
            Engine = engine;
            EngineVersion = engineVersion;
            Id = id;
            Ids = ids;
            InstanceChargeType = instanceChargeType;
            InstanceEngines = instanceEngines;
            MultiZone = multiZone;
            OutputFile = outputFile;
            ZoneId = zoneId;
        }
    }
}
