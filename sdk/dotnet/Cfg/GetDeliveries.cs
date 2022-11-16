// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Cfg
{
    public static class GetDeliveries
    {
        /// <summary>
        /// This data source provides the Config Deliveries of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.171.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Cfg.GetDeliveries.InvokeAsync(new AliCloud.Cfg.GetDeliveriesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.ConfigDeliveryId1 = ids.Apply(ids =&gt; ids.Deliveries?[0]?.Id);
        ///     }
        /// 
        ///     [Output("configDeliveryId1")]
        ///     public Output&lt;string&gt; ConfigDeliveryId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDeliveriesResult> InvokeAsync(GetDeliveriesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDeliveriesResult>("alicloud:cfg/getDeliveries:getDeliveries", args ?? new GetDeliveriesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Config Deliveries of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.171.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Cfg.GetDeliveries.InvokeAsync(new AliCloud.Cfg.GetDeliveriesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.ConfigDeliveryId1 = ids.Apply(ids =&gt; ids.Deliveries?[0]?.Id);
        ///     }
        /// 
        ///     [Output("configDeliveryId1")]
        ///     public Output&lt;string&gt; ConfigDeliveryId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDeliveriesResult> Invoke(GetDeliveriesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDeliveriesResult>("alicloud:cfg/getDeliveries:getDeliveries", args ?? new GetDeliveriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDeliveriesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Delivery IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by delivery channel name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled.
        /// </summary>
        [Input("status")]
        public int? Status { get; set; }

        public GetDeliveriesArgs()
        {
        }
    }

    public sealed class GetDeliveriesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Delivery IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by delivery channel name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the delivery method. Valid values: `0`: The delivery method is disabled. `1`: The delivery destination is enabled.
        /// </summary>
        [Input("status")]
        public Input<int>? Status { get; set; }

        public GetDeliveriesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDeliveriesResult
    {
        public readonly ImmutableArray<Outputs.GetDeliveriesDeliveryResult> Deliveries;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? Status;

        [OutputConstructor]
        private GetDeliveriesResult(
            ImmutableArray<Outputs.GetDeliveriesDeliveryResult> deliveries,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? status)
        {
            Deliveries = deliveries;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}