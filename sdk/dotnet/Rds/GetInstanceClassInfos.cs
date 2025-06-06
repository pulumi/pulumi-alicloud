// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Rds
{
    public static class GetInstanceClassInfos
    {
        /// <summary>
        /// This data source operation to query the instance types that are available to specific instances of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.196.0+
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
        ///     var resources = AliCloud.Rds.GetInstanceClassInfos.Invoke(new()
        ///     {
        ///         CommodityCode = "bards",
        ///         OrderType = "BUY",
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbInstanceClass"] = resources.Apply(getInstanceClassInfosResult =&gt; getInstanceClassInfosResult.Infos[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetInstanceClassInfosResult> InvokeAsync(GetInstanceClassInfosArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetInstanceClassInfosResult>("alicloud:rds/getInstanceClassInfos:getInstanceClassInfos", args ?? new GetInstanceClassInfosArgs(), options.WithDefaults());

        /// <summary>
        /// This data source operation to query the instance types that are available to specific instances of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.196.0+
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
        ///     var resources = AliCloud.Rds.GetInstanceClassInfos.Invoke(new()
        ///     {
        ///         CommodityCode = "bards",
        ///         OrderType = "BUY",
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbInstanceClass"] = resources.Apply(getInstanceClassInfosResult =&gt; getInstanceClassInfosResult.Infos[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceClassInfosResult> Invoke(GetInstanceClassInfosInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceClassInfosResult>("alicloud:rds/getInstanceClassInfos:getInstanceClassInfos", args ?? new GetInstanceClassInfosInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source operation to query the instance types that are available to specific instances of Alibaba Cloud.
        /// 
        /// &gt; **NOTE:** Available in v1.196.0+
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
        ///     var resources = AliCloud.Rds.GetInstanceClassInfos.Invoke(new()
        ///     {
        ///         CommodityCode = "bards",
        ///         OrderType = "BUY",
        ///         OutputFile = "./classes.txt",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstDbInstanceClass"] = resources.Apply(getInstanceClassInfosResult =&gt; getInstanceClassInfosResult.Infos[0]),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetInstanceClassInfosResult> Invoke(GetInstanceClassInfosInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetInstanceClassInfosResult>("alicloud:rds/getInstanceClassInfos:getInstanceClassInfos", args ?? new GetInstanceClassInfosInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetInstanceClassInfosArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The commodity code of the instance. Valid values:
        /// * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
        /// * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
        /// * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
        /// * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
        /// * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
        /// </summary>
        [Input("commodityCode", required: true)]
        public string CommodityCode { get; set; } = null!;

        /// <summary>
        /// The ID of the primary instance.
        /// </summary>
        [Input("dbInstanceId")]
        public string? DbInstanceId { get; set; }

        [Input("infos")]
        private List<Inputs.GetInstanceClassInfosInfoArgs>? _infos;

        /// <summary>
        /// A list of Rds available resource. Each element contains the following attributes:
        /// </summary>
        public List<Inputs.GetInstanceClassInfosInfoArgs> Infos
        {
            get => _infos ?? (_infos = new List<Inputs.GetInstanceClassInfosInfoArgs>());
            set => _infos = value;
        }

        /// <summary>
        /// FThe type of order that you want to query. Valid values:
        /// * **BUY**: specifies the query orders that are used to purchase instances.
        /// * **UPGRADE**: specifies the query orders that are used to change the specifications of instances.
        /// * **RENEW**: specifies the query orders that are used to renew instances.
        /// * **CONVERT**: specifies the query orders that are used to change the billing methods of instances.
        /// </summary>
        [Input("orderType", required: true)]
        public string OrderType { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi up`).
        /// 
        /// &gt; **NOTE**: If you use the CommodityCode parameter to query the instance types that are available to read-only instances, you must specify the DBInstanceId parameter.
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetInstanceClassInfosArgs()
        {
        }
        public static new GetInstanceClassInfosArgs Empty => new GetInstanceClassInfosArgs();
    }

    public sealed class GetInstanceClassInfosInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The commodity code of the instance. Valid values:
        /// * **bards**: The instance is a pay-as-you-go primary instance. This value is available on the China site (aliyun.com).
        /// * **rds**: The instance is a subscription primary instance. This value is available on the China site (aliyun.com).
        /// * **rords**: The instance is a pay-as-you-go read-only instance. This value is available on the China site (aliyun.com).
        /// * **rds_rordspre_public_cn**: The instance is a subscription read-only instance. This value is available on the China site (aliyun.com).
        /// * **bards_intl**: The instance is a pay-as-you-go primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_intl**: The instance is a subscription primary instance. This value is available on the International site (alibabacloud.com).
        /// * **rords_intl**: The instance is a pay-as-you-go read-only instance. This value is available on the International site (alibabacloud.com).
        /// * **rds_rordspre_public_intl**: The instance is a subscription read-only instance. This value is available on the International site (alibabacloud.com).
        /// </summary>
        [Input("commodityCode", required: true)]
        public Input<string> CommodityCode { get; set; } = null!;

        /// <summary>
        /// The ID of the primary instance.
        /// </summary>
        [Input("dbInstanceId")]
        public Input<string>? DbInstanceId { get; set; }

        [Input("infos")]
        private InputList<Inputs.GetInstanceClassInfosInfoInputArgs>? _infos;

        /// <summary>
        /// A list of Rds available resource. Each element contains the following attributes:
        /// </summary>
        public InputList<Inputs.GetInstanceClassInfosInfoInputArgs> Infos
        {
            get => _infos ?? (_infos = new InputList<Inputs.GetInstanceClassInfosInfoInputArgs>());
            set => _infos = value;
        }

        /// <summary>
        /// FThe type of order that you want to query. Valid values:
        /// * **BUY**: specifies the query orders that are used to purchase instances.
        /// * **UPGRADE**: specifies the query orders that are used to change the specifications of instances.
        /// * **RENEW**: specifies the query orders that are used to renew instances.
        /// * **CONVERT**: specifies the query orders that are used to change the billing methods of instances.
        /// </summary>
        [Input("orderType", required: true)]
        public Input<string> OrderType { get; set; } = null!;

        /// <summary>
        /// File name where to save data source results (after running `pulumi up`).
        /// 
        /// &gt; **NOTE**: If you use the CommodityCode parameter to query the instance types that are available to read-only instances, you must specify the DBInstanceId parameter.
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetInstanceClassInfosInvokeArgs()
        {
        }
        public static new GetInstanceClassInfosInvokeArgs Empty => new GetInstanceClassInfosInvokeArgs();
    }


    [OutputType]
    public sealed class GetInstanceClassInfosResult
    {
        public readonly string CommodityCode;
        public readonly string? DbInstanceId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Rds instance class codes.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        /// <summary>
        /// A list of Rds available resource. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetInstanceClassInfosInfoResult> Infos;
        public readonly string OrderType;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetInstanceClassInfosResult(
            string commodityCode,

            string? dbInstanceId,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetInstanceClassInfosInfoResult> infos,

            string orderType,

            string? outputFile)
        {
            CommodityCode = commodityCode;
            DbInstanceId = dbInstanceId;
            Id = id;
            Ids = ids;
            Infos = infos;
            OrderType = orderType;
            OutputFile = outputFile;
        }
    }
}
