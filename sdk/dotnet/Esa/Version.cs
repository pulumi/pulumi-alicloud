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
    /// Provides a ESA Site Version resource.
    /// 
    /// For information about ESA Site Version and how to use it, see [What is Site Version](https://next.api.alibabacloud.com/document/ESA/2024-09-10/CloneVersion).
    /// 
    /// &gt; **NOTE:** Available since v1.251.0.
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
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "bcd72239.com";
    ///     var @default = AliCloud.Esa.GetSites.Invoke(new()
    ///     {
    ///         PlanSubscribeType = "enterpriseplan",
    ///     });
    /// 
    ///     var defaultSite = new AliCloud.Esa.Site("default", new()
    ///     {
    ///         SiteName = name,
    ///         InstanceId = @default.Apply(@default =&gt; @default.Apply(getSitesResult =&gt; getSitesResult.Sites[0]?.InstanceId)),
    ///         Coverage = "overseas",
    ///         AccessType = "NS",
    ///         VersionManagement = true,
    ///     });
    /// 
    ///     var defaultVersion = new AliCloud.Esa.Version("default", new()
    ///     {
    ///         SiteId = defaultSite.Id,
    ///         Description = "example",
    ///         OriginVersion = 0,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ESA Site Version can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:esa/version:Version example &lt;site_id&gt;:&lt;site_version&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:esa/version:Version")]
    public partial class Version : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The creation time. The date format follows ISO8601 notation and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The Site version's description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        /// </summary>
        [Output("originVersion")]
        public Output<int> OriginVersion { get; private set; } = null!;

        /// <summary>
        /// The site ID, which can be obtained by calling the ListSites API.
        /// </summary>
        [Output("siteId")]
        public Output<int> SiteId { get; private set; } = null!;

        /// <summary>
        /// The version number of the site configuration.
        /// </summary>
        [Output("siteVersion")]
        public Output<int> SiteVersion { get; private set; } = null!;

        /// <summary>
        /// Site version status:：`online`.：`configuring`._faild`：`configure_faild`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a Version resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Version(string name, VersionArgs args, CustomResourceOptions? options = null)
            : base("alicloud:esa/version:Version", name, args ?? new VersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Version(string name, Input<string> id, VersionState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:esa/version:Version", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Version resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Version Get(string name, Input<string> id, VersionState? state = null, CustomResourceOptions? options = null)
        {
            return new Version(name, id, state, options);
        }
    }

    public sealed class VersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Site version's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        /// </summary>
        [Input("originVersion", required: true)]
        public Input<int> OriginVersion { get; set; } = null!;

        /// <summary>
        /// The site ID, which can be obtained by calling the ListSites API.
        /// </summary>
        [Input("siteId", required: true)]
        public Input<int> SiteId { get; set; } = null!;

        public VersionArgs()
        {
        }
        public static new VersionArgs Empty => new VersionArgs();
    }

    public sealed class VersionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The creation time. The date format follows ISO8601 notation and uses UTC time. The format is yyyy-MM-ddTHH:mm:ssZ.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The Site version's description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The version number of the site configuration. For sites that have enabled configuration version management, this parameter can be used to specify the effective version of the configuration site, which defaults to version 0.
        /// </summary>
        [Input("originVersion")]
        public Input<int>? OriginVersion { get; set; }

        /// <summary>
        /// The site ID, which can be obtained by calling the ListSites API.
        /// </summary>
        [Input("siteId")]
        public Input<int>? SiteId { get; set; }

        /// <summary>
        /// The version number of the site configuration.
        /// </summary>
        [Input("siteVersion")]
        public Input<int>? SiteVersion { get; set; }

        /// <summary>
        /// Site version status:：`online`.：`configuring`._faild`：`configure_faild`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public VersionState()
        {
        }
        public static new VersionState Empty => new VersionState();
    }
}
