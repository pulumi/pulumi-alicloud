// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz
{
    public static class GetEndpoints
    {
        /// <summary>
        /// This data source provides the Pvtz Endpoints of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.143.0+.
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
        ///         var ids = Output.Create(AliCloud.Pvtz.GetEndpoints.InvokeAsync(new AliCloud.Pvtz.GetEndpointsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.PvtzEndpointId1 = ids.Apply(ids =&gt; ids.Endpoints?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Pvtz.GetEndpoints.InvokeAsync(new AliCloud.Pvtz.GetEndpointsArgs
        ///         {
        ///             NameRegex = "^my-Endpoint",
        ///         }));
        ///         this.PvtzEndpointId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Endpoints?[0]?.Id);
        ///     }
        /// 
        ///     [Output("pvtzEndpointId1")]
        ///     public Output&lt;string&gt; PvtzEndpointId1 { get; set; }
        ///     [Output("pvtzEndpointId2")]
        ///     public Output&lt;string&gt; PvtzEndpointId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEndpointsResult> InvokeAsync(GetEndpointsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEndpointsResult>("alicloud:pvtz/getEndpoints:getEndpoints", args ?? new GetEndpointsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Pvtz Endpoints of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.143.0+.
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
        ///         var ids = Output.Create(AliCloud.Pvtz.GetEndpoints.InvokeAsync(new AliCloud.Pvtz.GetEndpointsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.PvtzEndpointId1 = ids.Apply(ids =&gt; ids.Endpoints?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Pvtz.GetEndpoints.InvokeAsync(new AliCloud.Pvtz.GetEndpointsArgs
        ///         {
        ///             NameRegex = "^my-Endpoint",
        ///         }));
        ///         this.PvtzEndpointId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Endpoints?[0]?.Id);
        ///     }
        /// 
        ///     [Output("pvtzEndpointId1")]
        ///     public Output&lt;string&gt; PvtzEndpointId1 { get; set; }
        ///     [Output("pvtzEndpointId2")]
        ///     public Output&lt;string&gt; PvtzEndpointId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEndpointsResult> Invoke(GetEndpointsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetEndpointsResult>("alicloud:pvtz/getEndpoints:getEndpoints", args ?? new GetEndpointsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEndpointsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Endpoint IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Endpoint name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetEndpointsArgs()
        {
        }
    }

    public sealed class GetEndpointsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Endpoint IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Endpoint name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `CHANGE_FAILED`, `CHANGE_INIT`, `EXCEPTION`, `FAILED`, `INIT`, `SUCCESS`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetEndpointsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEndpointsResult
    {
        public readonly ImmutableArray<Outputs.GetEndpointsEndpointResult> Endpoints;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetEndpointsResult(
            ImmutableArray<Outputs.GetEndpointsEndpointResult> endpoints,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            Endpoints = endpoints;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}