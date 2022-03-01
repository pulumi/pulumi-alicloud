// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Nas
{
    public static class GetDataFlows
    {
        /// <summary>
        /// This data source provides the Nas Data Flows of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.153.0+.
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
        ///         var ids = Output.Create(AliCloud.Nas.GetDataFlows.InvokeAsync(new AliCloud.Nas.GetDataFlowsArgs
        ///         {
        ///             FileSystemId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///         }));
        ///         this.NasDataFlowId1 = ids.Apply(ids =&gt; ids.Flows?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Nas.GetDataFlows.InvokeAsync(new AliCloud.Nas.GetDataFlowsArgs
        ///         {
        ///             FileSystemId = "example_value",
        ///             Status = "Running",
        ///         }));
        ///         this.NasDataFlowId2 = status.Apply(status =&gt; status.Flows?[0]?.Id);
        ///     }
        /// 
        ///     [Output("nasDataFlowId1")]
        ///     public Output&lt;string&gt; NasDataFlowId1 { get; set; }
        ///     [Output("nasDataFlowId2")]
        ///     public Output&lt;string&gt; NasDataFlowId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDataFlowsResult> InvokeAsync(GetDataFlowsArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDataFlowsResult>("alicloud:nas/getDataFlows:getDataFlows", args ?? new GetDataFlowsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Nas Data Flows of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.153.0+.
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
        ///         var ids = Output.Create(AliCloud.Nas.GetDataFlows.InvokeAsync(new AliCloud.Nas.GetDataFlowsArgs
        ///         {
        ///             FileSystemId = "example_value",
        ///             Ids = 
        ///             {
        ///                 "example_value-1",
        ///                 "example_value-2",
        ///             },
        ///         }));
        ///         this.NasDataFlowId1 = ids.Apply(ids =&gt; ids.Flows?[0]?.Id);
        ///         var status = Output.Create(AliCloud.Nas.GetDataFlows.InvokeAsync(new AliCloud.Nas.GetDataFlowsArgs
        ///         {
        ///             FileSystemId = "example_value",
        ///             Status = "Running",
        ///         }));
        ///         this.NasDataFlowId2 = status.Apply(status =&gt; status.Flows?[0]?.Id);
        ///     }
        /// 
        ///     [Output("nasDataFlowId1")]
        ///     public Output&lt;string&gt; NasDataFlowId1 { get; set; }
        ///     [Output("nasDataFlowId2")]
        ///     public Output&lt;string&gt; NasDataFlowId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDataFlowsResult> Invoke(GetDataFlowsInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDataFlowsResult>("alicloud:nas/getDataFlows:getDataFlows", args ?? new GetDataFlowsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDataFlowsArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public string FileSystemId { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Data Flow IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the Data flow.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetDataFlowsArgs()
        {
        }
    }

    public sealed class GetDataFlowsInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the file system.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public Input<string> FileSystemId { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Data Flow IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the Data flow.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetDataFlowsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDataFlowsResult
    {
        public readonly string FileSystemId;
        public readonly ImmutableArray<Outputs.GetDataFlowsFlowResult> Flows;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetDataFlowsResult(
            string fileSystemId,

            ImmutableArray<Outputs.GetDataFlowsFlowResult> flows,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            string? status)
        {
            FileSystemId = fileSystemId;
            Flows = flows;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            Status = status;
        }
    }
}