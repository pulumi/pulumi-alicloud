// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.PolarDB
{
    /// <summary>
    /// Provides a PolarDB endpoint address resource to allocate an Internet endpoint address string for PolarDB instance.
    /// 
    /// &gt; **NOTE:** Available in v1.68.0+. Each PolarDB instance will allocate a intranet connection string automatically and its prefix is Cluster ID.
    ///  To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.
    /// 
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/polardb_endpoint_address.html.markdown.
    /// </summary>
    public partial class EndpointAddress : Pulumi.CustomResource
    {
        /// <summary>
        /// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;db_endpoint_id&gt; + 'tf'.
        /// </summary>
        [Output("connectionPrefix")]
        public Output<string> ConnectionPrefix { get; private set; } = null!;

        /// <summary>
        /// Connection cluster or endpoint string.
        /// </summary>
        [Output("connectionString")]
        public Output<string> ConnectionString { get; private set; } = null!;

        /// <summary>
        /// The Id of cluster that can run database.
        /// </summary>
        [Output("dbClusterId")]
        public Output<string> DbClusterId { get; private set; } = null!;

        /// <summary>
        /// The Id of endpoint that can run database.
        /// </summary>
        [Output("dbEndpointId")]
        public Output<string> DbEndpointId { get; private set; } = null!;

        /// <summary>
        /// The ip address of connection string.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// Internet connection net type. Valid value: `Public`. Default to `Public`. Currently supported only `Public`.
        /// </summary>
        [Output("netType")]
        public Output<string?> NetType { get; private set; } = null!;

        /// <summary>
        /// Connection cluster or endpoint port.
        /// </summary>
        [Output("port")]
        public Output<string> Port { get; private set; } = null!;


        /// <summary>
        /// Create a EndpointAddress resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public EndpointAddress(string name, EndpointAddressArgs args, CustomResourceOptions? options = null)
            : base("alicloud:polardb/endpointAddress:EndpointAddress", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private EndpointAddress(string name, Input<string> id, EndpointAddressState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:polardb/endpointAddress:EndpointAddress", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing EndpointAddress resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static EndpointAddress Get(string name, Input<string> id, EndpointAddressState? state = null, CustomResourceOptions? options = null)
        {
            return new EndpointAddress(name, id, state, options);
        }
    }

    public sealed class EndpointAddressArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;db_endpoint_id&gt; + 'tf'.
        /// </summary>
        [Input("connectionPrefix")]
        public Input<string>? ConnectionPrefix { get; set; }

        /// <summary>
        /// The Id of cluster that can run database.
        /// </summary>
        [Input("dbClusterId", required: true)]
        public Input<string> DbClusterId { get; set; } = null!;

        /// <summary>
        /// The Id of endpoint that can run database.
        /// </summary>
        [Input("dbEndpointId", required: true)]
        public Input<string> DbEndpointId { get; set; } = null!;

        /// <summary>
        /// Internet connection net type. Valid value: `Public`. Default to `Public`. Currently supported only `Public`.
        /// </summary>
        [Input("netType")]
        public Input<string>? NetType { get; set; }

        public EndpointAddressArgs()
        {
        }
    }

    public sealed class EndpointAddressState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to &lt;db_endpoint_id&gt; + 'tf'.
        /// </summary>
        [Input("connectionPrefix")]
        public Input<string>? ConnectionPrefix { get; set; }

        /// <summary>
        /// Connection cluster or endpoint string.
        /// </summary>
        [Input("connectionString")]
        public Input<string>? ConnectionString { get; set; }

        /// <summary>
        /// The Id of cluster that can run database.
        /// </summary>
        [Input("dbClusterId")]
        public Input<string>? DbClusterId { get; set; }

        /// <summary>
        /// The Id of endpoint that can run database.
        /// </summary>
        [Input("dbEndpointId")]
        public Input<string>? DbEndpointId { get; set; }

        /// <summary>
        /// The ip address of connection string.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// Internet connection net type. Valid value: `Public`. Default to `Public`. Currently supported only `Public`.
        /// </summary>
        [Input("netType")]
        public Input<string>? NetType { get; set; }

        /// <summary>
        /// Connection cluster or endpoint port.
        /// </summary>
        [Input("port")]
        public Input<string>? Port { get; set; }

        public EndpointAddressState()
        {
        }
    }
}