// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ServiceMesh
{
    public static class GetServiceMeshes
    {
        /// <summary>
        /// This data source provides the Service Mesh Service Meshes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.138.0+.
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
        ///         var ids = Output.Create(AliCloud.ServiceMesh.GetServiceMeshes.InvokeAsync(new AliCloud.ServiceMesh.GetServiceMeshesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.ServiceMeshServiceMeshId1 = ids.Apply(ids =&gt; ids.Meshes?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.ServiceMesh.GetServiceMeshes.InvokeAsync(new AliCloud.ServiceMesh.GetServiceMeshesArgs
        ///         {
        ///             NameRegex = "^my-ServiceMesh",
        ///         }));
        ///         this.ServiceMeshServiceMeshId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Meshes?[0]?.Id);
        ///         var status = Output.Create(AliCloud.ServiceMesh.GetServiceMeshes.InvokeAsync(new AliCloud.ServiceMesh.GetServiceMeshesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///             Status = "running",
        ///         }));
        ///         this.ServiceMeshServiceMeshId3 = status.Apply(status =&gt; status.Meshes?[0]?.Id);
        ///     }
        /// 
        ///     [Output("serviceMeshServiceMeshId1")]
        ///     public Output&lt;string&gt; ServiceMeshServiceMeshId1 { get; set; }
        ///     [Output("serviceMeshServiceMeshId2")]
        ///     public Output&lt;string&gt; ServiceMeshServiceMeshId2 { get; set; }
        ///     [Output("serviceMeshServiceMeshId3")]
        ///     public Output&lt;string&gt; ServiceMeshServiceMeshId3 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetServiceMeshesResult> InvokeAsync(GetServiceMeshesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetServiceMeshesResult>("alicloud:servicemesh/getServiceMeshes:getServiceMeshes", args ?? new GetServiceMeshesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Service Mesh Service Meshes of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.138.0+.
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
        ///         var ids = Output.Create(AliCloud.ServiceMesh.GetServiceMeshes.InvokeAsync(new AliCloud.ServiceMesh.GetServiceMeshesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.ServiceMeshServiceMeshId1 = ids.Apply(ids =&gt; ids.Meshes?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.ServiceMesh.GetServiceMeshes.InvokeAsync(new AliCloud.ServiceMesh.GetServiceMeshesArgs
        ///         {
        ///             NameRegex = "^my-ServiceMesh",
        ///         }));
        ///         this.ServiceMeshServiceMeshId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Meshes?[0]?.Id);
        ///         var status = Output.Create(AliCloud.ServiceMesh.GetServiceMeshes.InvokeAsync(new AliCloud.ServiceMesh.GetServiceMeshesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///             Status = "running",
        ///         }));
        ///         this.ServiceMeshServiceMeshId3 = status.Apply(status =&gt; status.Meshes?[0]?.Id);
        ///     }
        /// 
        ///     [Output("serviceMeshServiceMeshId1")]
        ///     public Output&lt;string&gt; ServiceMeshServiceMeshId1 { get; set; }
        ///     [Output("serviceMeshServiceMeshId2")]
        ///     public Output&lt;string&gt; ServiceMeshServiceMeshId2 { get; set; }
        ///     [Output("serviceMeshServiceMeshId3")]
        ///     public Output&lt;string&gt; ServiceMeshServiceMeshId3 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetServiceMeshesResult> Invoke(GetServiceMeshesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetServiceMeshesResult>("alicloud:servicemesh/getServiceMeshes:getServiceMeshes", args ?? new GetServiceMeshesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceMeshesArgs : Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Service Mesh IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Service Mesh name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetServiceMeshesArgs()
        {
        }
    }

    public sealed class GetServiceMeshesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Service Mesh IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Service Mesh name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetServiceMeshesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetServiceMeshesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<Outputs.GetServiceMeshesMeshResult> Meshes;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Status;

        [OutputConstructor]
        private GetServiceMeshesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            ImmutableArray<Outputs.GetServiceMeshesMeshResult> meshes,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? status)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Meshes = meshes;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Status = status;
        }
    }
}