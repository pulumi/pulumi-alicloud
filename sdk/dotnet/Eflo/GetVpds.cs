// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Eflo
{
    public static class GetVpds
    {
        /// <summary>
        /// This data source provides Eflo Vpd available to the user.[What is Vpd](https://help.aliyun.com/document_detail/604976.html)
        /// 
        /// &gt; **NOTE:** Available in 1.201.0+
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
        ///     var @default = AliCloud.Eflo.GetVpds.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudEfloVpd.Id,
        ///         },
        ///         NameRegex = defaultAlicloudEfloVpd.Name,
        ///         VpdName = "RMC-Terraform-Test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudEfloVpdExampleId"] = @default.Apply(@default =&gt; @default.Apply(getVpdsResult =&gt; getVpdsResult.Vpds[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetVpdsResult> InvokeAsync(GetVpdsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVpdsResult>("alicloud:eflo/getVpds:getVpds", args ?? new GetVpdsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Eflo Vpd available to the user.[What is Vpd](https://help.aliyun.com/document_detail/604976.html)
        /// 
        /// &gt; **NOTE:** Available in 1.201.0+
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
        ///     var @default = AliCloud.Eflo.GetVpds.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudEfloVpd.Id,
        ///         },
        ///         NameRegex = defaultAlicloudEfloVpd.Name,
        ///         VpdName = "RMC-Terraform-Test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudEfloVpdExampleId"] = @default.Apply(@default =&gt; @default.Apply(getVpdsResult =&gt; getVpdsResult.Vpds[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpdsResult> Invoke(GetVpdsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpdsResult>("alicloud:eflo/getVpds:getVpds", args ?? new GetVpdsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides Eflo Vpd available to the user.[What is Vpd](https://help.aliyun.com/document_detail/604976.html)
        /// 
        /// &gt; **NOTE:** Available in 1.201.0+
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
        ///     var @default = AliCloud.Eflo.GetVpds.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             defaultAlicloudEfloVpd.Id,
        ///         },
        ///         NameRegex = defaultAlicloudEfloVpd.Name,
        ///         VpdName = "RMC-Terraform-Test",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["alicloudEfloVpdExampleId"] = @default.Apply(@default =&gt; @default.Apply(getVpdsResult =&gt; getVpdsResult.Vpds[0]?.Id)),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetVpdsResult> Invoke(GetVpdsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetVpdsResult>("alicloud:eflo/getVpds:getVpds", args ?? new GetVpdsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVpdsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Vpd IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
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
        /// The Resource group id
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        /// <summary>
        /// The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The id of the vpd.
        /// </summary>
        [Input("vpdId")]
        public string? VpdId { get; set; }

        /// <summary>
        /// The Name of the VPD.
        /// </summary>
        [Input("vpdName")]
        public string? VpdName { get; set; }

        public GetVpdsArgs()
        {
        }
        public static new GetVpdsArgs Empty => new GetVpdsArgs();
    }

    public sealed class GetVpdsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Vpd IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by Group Metric Rule name.
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
        /// The Resource group id
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The Vpd status. Valid values: `Available`, `Not Available`, `Executing`, `Deleting`,
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The id of the vpd.
        /// </summary>
        [Input("vpdId")]
        public Input<string>? VpdId { get; set; }

        /// <summary>
        /// The Name of the VPD.
        /// </summary>
        [Input("vpdName")]
        public Input<string>? VpdName { get; set; }

        public GetVpdsInvokeArgs()
        {
        }
        public static new GetVpdsInvokeArgs Empty => new GetVpdsInvokeArgs();
    }


    [OutputType]
    public sealed class GetVpdsResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Vpd IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of name of Vpds.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// Resource group id
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// The Vpd status.
        /// </summary>
        public readonly string? Status;
        /// <summary>
        /// The id of the vpd.
        /// </summary>
        public readonly string? VpdId;
        /// <summary>
        /// The Name of the VPD.
        /// </summary>
        public readonly string? VpdName;
        /// <summary>
        /// A list of Vpd Entries. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetVpdsVpdResult> Vpds;

        [OutputConstructor]
        private GetVpdsResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? resourceGroupId,

            string? status,

            string? vpdId,

            string? vpdName,

            ImmutableArray<Outputs.GetVpdsVpdResult> vpds)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            ResourceGroupId = resourceGroupId;
            Status = status;
            VpdId = vpdId;
            VpdName = vpdName;
            Vpds = vpds;
        }
    }
}
