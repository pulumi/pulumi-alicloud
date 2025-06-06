// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Esa
{
    /// <summary>
    /// Provides a ESA Client Ca Certificate resource.
    /// 
    /// For information about ESA Client Ca Certificate and how to use it, see [What is Client Ca Certificate](https://next.api.alibabacloud.com/document/ESA/2024-09-10/UploadClientCaCertificate).
    /// 
    /// &gt; **NOTE:** Available since v1.244.0.
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
    ///     var @default = AliCloud.Esa.GetSites.Invoke(new()
    ///     {
    ///         PlanSubscribeType = "enterpriseplan",
    ///         SiteName = "gositecdn.cn",
    ///     });
    /// 
    ///     var defaultClientCaCertificate = new AliCloud.Esa.ClientCaCertificate("default", new()
    ///     {
    ///         Certificate = @"-----BEGIN CERTIFICATE-----
    /// ****-----END CERTIFICATE-----",
    ///         ClientCaCertName = "example",
    ///         SiteId = @default.Apply(@default =&gt; @default.Apply(getSitesResult =&gt; getSitesResult.Sites[0]?.Id)),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ESA Client Ca Certificate can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:esa/clientCaCertificate:ClientCaCertificate example &lt;site_id&gt;:&lt;client_ca_cert_id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:esa/clientCaCertificate:ClientCaCertificate")]
    public partial class ClientCaCertificate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Certificate content.
        /// </summary>
        [Output("certificate")]
        public Output<string> Certificate { get; private set; } = null!;

        /// <summary>
        /// ClientCaCertificate Id
        /// </summary>
        [Output("clientCaCertId")]
        public Output<string> ClientCaCertId { get; private set; } = null!;

        /// <summary>
        /// The certificate name.
        /// </summary>
        [Output("clientCaCertName")]
        public Output<string?> ClientCaCertName { get; private set; } = null!;

        /// <summary>
        /// Creation time.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Site Id
        /// </summary>
        [Output("siteId")]
        public Output<int> SiteId { get; private set; } = null!;

        /// <summary>
        /// Certificate status.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a ClientCaCertificate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClientCaCertificate(string name, ClientCaCertificateArgs args, CustomResourceOptions? options = null)
            : base("alicloud:esa/clientCaCertificate:ClientCaCertificate", name, args ?? new ClientCaCertificateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClientCaCertificate(string name, Input<string> id, ClientCaCertificateState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:esa/clientCaCertificate:ClientCaCertificate", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ClientCaCertificate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClientCaCertificate Get(string name, Input<string> id, ClientCaCertificateState? state = null, CustomResourceOptions? options = null)
        {
            return new ClientCaCertificate(name, id, state, options);
        }
    }

    public sealed class ClientCaCertificateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Certificate content.
        /// </summary>
        [Input("certificate", required: true)]
        public Input<string> Certificate { get; set; } = null!;

        /// <summary>
        /// The certificate name.
        /// </summary>
        [Input("clientCaCertName")]
        public Input<string>? ClientCaCertName { get; set; }

        /// <summary>
        /// Site Id
        /// </summary>
        [Input("siteId", required: true)]
        public Input<int> SiteId { get; set; } = null!;

        public ClientCaCertificateArgs()
        {
        }
        public static new ClientCaCertificateArgs Empty => new ClientCaCertificateArgs();
    }

    public sealed class ClientCaCertificateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Certificate content.
        /// </summary>
        [Input("certificate")]
        public Input<string>? Certificate { get; set; }

        /// <summary>
        /// ClientCaCertificate Id
        /// </summary>
        [Input("clientCaCertId")]
        public Input<string>? ClientCaCertId { get; set; }

        /// <summary>
        /// The certificate name.
        /// </summary>
        [Input("clientCaCertName")]
        public Input<string>? ClientCaCertName { get; set; }

        /// <summary>
        /// Creation time.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Site Id
        /// </summary>
        [Input("siteId")]
        public Input<int>? SiteId { get; set; }

        /// <summary>
        /// Certificate status.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public ClientCaCertificateState()
        {
        }
        public static new ClientCaCertificateState Empty => new ClientCaCertificateState();
    }
}
