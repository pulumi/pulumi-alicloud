// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.ResourceManager
{
    public static class GetDelegatedAdministrators
    {
        /// <summary>
        /// This data source provides the Resource Manager Delegated Administrators of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.181.0+.
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
        ///         var ids = Output.Create(AliCloud.ResourceManager.GetDelegatedAdministrators.InvokeAsync(new AliCloud.ResourceManager.GetDelegatedAdministratorsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.ResourceManagerDelegatedAdministratorId1 = ids.Apply(ids =&gt; ids.Administrators?[0]?.Id);
        ///     }
        /// 
        ///     [Output("resourceManagerDelegatedAdministratorId1")]
        ///     public Output&lt;string&gt; ResourceManagerDelegatedAdministratorId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetDelegatedAdministratorsResult> InvokeAsync(GetDelegatedAdministratorsArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetDelegatedAdministratorsResult>("alicloud:resourcemanager/getDelegatedAdministrators:getDelegatedAdministrators", args ?? new GetDelegatedAdministratorsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Resource Manager Delegated Administrators of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.181.0+.
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
        ///         var ids = Output.Create(AliCloud.ResourceManager.GetDelegatedAdministrators.InvokeAsync(new AliCloud.ResourceManager.GetDelegatedAdministratorsArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.ResourceManagerDelegatedAdministratorId1 = ids.Apply(ids =&gt; ids.Administrators?[0]?.Id);
        ///     }
        /// 
        ///     [Output("resourceManagerDelegatedAdministratorId1")]
        ///     public Output&lt;string&gt; ResourceManagerDelegatedAdministratorId1 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetDelegatedAdministratorsResult> Invoke(GetDelegatedAdministratorsInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetDelegatedAdministratorsResult>("alicloud:resourcemanager/getDelegatedAdministrators:getDelegatedAdministrators", args ?? new GetDelegatedAdministratorsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetDelegatedAdministratorsArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Delegated Administrator IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The identity of the trusted service.
        /// </summary>
        [Input("servicePrincipal")]
        public string? ServicePrincipal { get; set; }

        public GetDelegatedAdministratorsArgs()
        {
        }
    }

    public sealed class GetDelegatedAdministratorsInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Delegated Administrator IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The identity of the trusted service.
        /// </summary>
        [Input("servicePrincipal")]
        public Input<string>? ServicePrincipal { get; set; }

        public GetDelegatedAdministratorsInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetDelegatedAdministratorsResult
    {
        public readonly ImmutableArray<Outputs.GetDelegatedAdministratorsAdministratorResult> Administrators;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        public readonly string? ServicePrincipal;

        [OutputConstructor]
        private GetDelegatedAdministratorsResult(
            ImmutableArray<Outputs.GetDelegatedAdministratorsAdministratorResult> administrators,

            string id,

            ImmutableArray<string> ids,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? servicePrincipal)
        {
            Administrators = administrators;
            Id = id;
            Ids = ids;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            ServicePrincipal = servicePrincipal;
        }
    }
}