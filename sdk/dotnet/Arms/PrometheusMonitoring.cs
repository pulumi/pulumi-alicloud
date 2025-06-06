// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Arms
{
    /// <summary>
    /// Provides a ARMS Prometheus Monitoring resource. Including serviceMonitor, podMonitor, customJob, probe and other four types of monitoring.
    /// 
    /// For information about ARMS Prometheus Monitoring and how to use it, see [What is Prometheus Monitoring](https://www.alibabacloud.com/help/en/arms/prometheus-monitoring/api-arms-2019-08-08-createprometheusmonitoring).
    /// 
    /// &gt; **NOTE:** Available since v1.209.0.
    /// 
    /// ## Import
    /// 
    /// ARMS Prometheus Monitoring can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:arms/prometheusMonitoring:PrometheusMonitoring example &lt;cluster_id&gt;:&lt;monitoring_name&gt;:&lt;type&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:arms/prometheusMonitoring:PrometheusMonitoring")]
    public partial class PrometheusMonitoring : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the prometheus instance.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// Yaml configuration for monitoring.
        /// </summary>
        [Output("configYaml")]
        public Output<string> ConfigYaml { get; private set; } = null!;

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Output("monitoringName")]
        public Output<string> MonitoringName { get; private set; } = null!;

        /// <summary>
        /// Valid values: `stop`, `run`.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a PrometheusMonitoring resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrometheusMonitoring(string name, PrometheusMonitoringArgs args, CustomResourceOptions? options = null)
            : base("alicloud:arms/prometheusMonitoring:PrometheusMonitoring", name, args ?? new PrometheusMonitoringArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrometheusMonitoring(string name, Input<string> id, PrometheusMonitoringState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:arms/prometheusMonitoring:PrometheusMonitoring", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrometheusMonitoring resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrometheusMonitoring Get(string name, Input<string> id, PrometheusMonitoringState? state = null, CustomResourceOptions? options = null)
        {
            return new PrometheusMonitoring(name, id, state, options);
        }
    }

    public sealed class PrometheusMonitoringArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the prometheus instance.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// Yaml configuration for monitoring.
        /// </summary>
        [Input("configYaml", required: true)]
        public Input<string> ConfigYaml { get; set; } = null!;

        /// <summary>
        /// Valid values: `stop`, `run`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PrometheusMonitoringArgs()
        {
        }
        public static new PrometheusMonitoringArgs Empty => new PrometheusMonitoringArgs();
    }

    public sealed class PrometheusMonitoringState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the prometheus instance.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// Yaml configuration for monitoring.
        /// </summary>
        [Input("configYaml")]
        public Input<string>? ConfigYaml { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("monitoringName")]
        public Input<string>? MonitoringName { get; set; }

        /// <summary>
        /// Valid values: `stop`, `run`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Monitoring type: `serviceMonitor`, `podMonitor`, `customJob`, `probe`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PrometheusMonitoringState()
        {
        }
        public static new PrometheusMonitoringState Empty => new PrometheusMonitoringState();
    }
}
