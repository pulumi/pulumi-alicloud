// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Waf
{
    public static class GetCertificates
    {
        /// <summary>
        /// This data source provides the Waf Certificates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
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
        ///         var @default = Output.Create(AliCloud.Waf.GetCertificates.InvokeAsync(new AliCloud.Waf.GetCertificatesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "your_certificate_id",
        ///             },
        ///             InstanceId = "your_instance_id",
        ///             Domain = "your_domain_name",
        ///         }));
        ///         this.WafCertificate = @default.Apply(@default =&gt; @default.Certificates?[0]);
        ///     }
        /// 
        ///     [Output("wafCertificate")]
        ///     public Output&lt;string&gt; WafCertificate { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetCertificatesResult> InvokeAsync(GetCertificatesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetCertificatesResult>("alicloud:waf/getCertificates:getCertificates", args ?? new GetCertificatesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Waf Certificates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.135.0+.
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
        ///         var @default = Output.Create(AliCloud.Waf.GetCertificates.InvokeAsync(new AliCloud.Waf.GetCertificatesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "your_certificate_id",
        ///             },
        ///             InstanceId = "your_instance_id",
        ///             Domain = "your_domain_name",
        ///         }));
        ///         this.WafCertificate = @default.Apply(@default =&gt; @default.Certificates?[0]);
        ///     }
        /// 
        ///     [Output("wafCertificate")]
        ///     public Output&lt;string&gt; WafCertificate { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetCertificatesResult> Invoke(GetCertificatesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetCertificatesResult>("alicloud:waf/getCertificates:getCertificates", args ?? new GetCertificatesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCertificatesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The domain that you want to add to WAF.
        /// </summary>
        [Input("domain")]
        public string? Domain { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Certificate IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// WAF instance ID.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Certificate name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        public GetCertificatesArgs()
        {
        }
    }

    public sealed class GetCertificatesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The domain that you want to add to WAF.
        /// </summary>
        [Input("domain")]
        public Input<string>? Domain { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Certificate IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// WAF instance ID.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Certificate name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        public GetCertificatesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetCertificatesResult
    {
        public readonly ImmutableArray<Outputs.GetCertificatesCertificateResult> Certificates;
        public readonly string? Domain;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string InstanceId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;

        [OutputConstructor]
        private GetCertificatesResult(
            ImmutableArray<Outputs.GetCertificatesCertificateResult> certificates,

            string? domain,

            string id,

            ImmutableArray<string> ids,

            string instanceId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile)
        {
            Certificates = certificates;
            Domain = domain;
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
        }
    }
}