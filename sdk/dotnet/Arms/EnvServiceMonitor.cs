// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms
{
    /// <summary>
    /// Provides a ARMS Env Service Monitor resource. ServiceMonitor for the arms environment.
    /// 
    /// For information about ARMS Env Service Monitor and how to use it, see [What is Env Service Monitor](https://www.alibabacloud.com/help/en/arms/developer-reference/api-arms-2019-08-08-createenvservicemonitor).
    /// 
    /// &gt; **NOTE:** Available since v1.212.0.
    /// 
    /// ## Import
    /// 
    /// ARMS Env Service Monitor can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:arms/envServiceMonitor:EnvServiceMonitor example &lt;environment_id&gt;:&lt;namespace&gt;:&lt;env_service_monitor_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:arms/envServiceMonitor:EnvServiceMonitor")]
    public partial class EnvServiceMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Language environment, default is Chinese zh | en.
        /// </summary>
        [Output("aliyunLang")]
        public Output<string?> AliyunLang { get; private set; } = null!;

        /// <summary>
        /// Yaml configuration string.
        /// </summary>
        [Output("configYaml")]
        public Output<string> ConfigYaml { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("envServiceMonitorName")]
        public Output<string> EnvServiceMonitorName { get; private set; } = null!;

        /// <summary>
        /// Environment id.
        /// </summary>
        [Output("environmentId")]
        public Output<string> EnvironmentId { get; private set; } = null!;

        /// <summary>
        /// The namespace where the resource is located.
        /// </summary>
        [Output("namespace")]
        public Output<string> Namespace { get; private set; } = null!;

        /// <summary>
        /// Status: run, stop.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a EnvServiceMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EnvServiceMonitor(string name, EnvServiceMonitorArgs args, CustomResourceOptions? options = null)
            : base("alicloud:arms/envServiceMonitor:EnvServiceMonitor", name, args ?? new EnvServiceMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private EnvServiceMonitor(string name, Input<string> id, EnvServiceMonitorState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:arms/envServiceMonitor:EnvServiceMonitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EnvServiceMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EnvServiceMonitor Get(string name, Input<string> id, EnvServiceMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new EnvServiceMonitor(name, id, state, options);
        }
    }

    public sealed class EnvServiceMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language environment, default is Chinese zh | en.
        /// </summary>
        [Input("aliyunLang")]
        public Input<string>? AliyunLang { get; set; }

        /// <summary>
        /// Yaml configuration string.
        /// </summary>
        [Input("configYaml", required: true)]
        public Input<string> ConfigYaml { get; set; } = null!;

        /// <summary>
        /// Environment id.
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<string> EnvironmentId { get; set; } = null!;

        public EnvServiceMonitorArgs()
        {
        }
        public static new EnvServiceMonitorArgs Empty => new EnvServiceMonitorArgs();
    }

    public sealed class EnvServiceMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Language environment, default is Chinese zh | en.
        /// </summary>
        [Input("aliyunLang")]
        public Input<string>? AliyunLang { get; set; }

        /// <summary>
        /// Yaml configuration string.
        /// </summary>
        [Input("configYaml")]
        public Input<string>? ConfigYaml { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("envServiceMonitorName")]
        public Input<string>? EnvServiceMonitorName { get; set; }

        /// <summary>
        /// Environment id.
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        /// <summary>
        /// The namespace where the resource is located.
        /// </summary>
        [Input("namespace")]
        public Input<string>? Namespace { get; set; }

        /// <summary>
        /// Status: run, stop.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public EnvServiceMonitorState()
        {
        }
        public static new EnvServiceMonitorState Empty => new EnvServiceMonitorState();
    }
}