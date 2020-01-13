// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.FC
{
    /// <summary>
    /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/fc_service.html.markdown.
    /// </summary>
    public partial class Service : Pulumi.CustomResource
    {
        /// <summary>
        /// The function compute service description.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether to allow the service to access Internet. Default to "true".
        /// </summary>
        [Output("internetAccess")]
        public Output<bool?> InternetAccess { get; private set; } = null!;

        /// <summary>
        /// The date this resource was last modified.
        /// </summary>
        [Output("lastModified")]
        public Output<string> LastModified { get; private set; } = null!;

        /// <summary>
        /// Provide this to store your FC service logs. Fields documented below. See [Create a Service](https://www.alibabacloud.com/help/doc-detail/51924.htm).
        /// </summary>
        [Output("logConfig")]
        public Output<Outputs.ServiceLogConfig?> LogConfig { get; private set; } = null!;

        /// <summary>
        /// The Function Compute service name. It is the only in one Alicloud account and is conflict with "name_prefix".
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Setting a prefix to get a only name. It is conflict with "name".
        /// </summary>
        [Output("namePrefix")]
        public Output<string?> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
        /// </summary>
        [Output("role")]
        public Output<string?> Role { get; private set; } = null!;

        /// <summary>
        /// The Function Compute service ID.
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;

        /// <summary>
        /// Provide this to allow your FC service to access your VPC. Fields documented below. See [Function Compute Service in VPC](https://www.alibabacloud.com/help/faq-detail/72959.htm).
        /// </summary>
        [Output("vpcConfig")]
        public Output<Outputs.ServiceVpcConfig?> VpcConfig { get; private set; } = null!;


        /// <summary>
        /// Create a Service resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Service(string name, ServiceArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:fc/service:Service", name, args ?? ResourceArgs.Empty, MakeResourceOptions(options, ""))
        {
        }

        private Service(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:fc/service:Service", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Service resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Service Get(string name, Input<string> id, ServiceState? state = null, CustomResourceOptions? options = null)
        {
            return new Service(name, id, state, options);
        }
    }

    public sealed class ServiceArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The function compute service description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to allow the service to access Internet. Default to "true".
        /// </summary>
        [Input("internetAccess")]
        public Input<bool>? InternetAccess { get; set; }

        /// <summary>
        /// Provide this to store your FC service logs. Fields documented below. See [Create a Service](https://www.alibabacloud.com/help/doc-detail/51924.htm).
        /// </summary>
        [Input("logConfig")]
        public Input<Inputs.ServiceLogConfigArgs>? LogConfig { get; set; }

        /// <summary>
        /// The Function Compute service name. It is the only in one Alicloud account and is conflict with "name_prefix".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Setting a prefix to get a only name. It is conflict with "name".
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// Provide this to allow your FC service to access your VPC. Fields documented below. See [Function Compute Service in VPC](https://www.alibabacloud.com/help/faq-detail/72959.htm).
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ServiceVpcConfigArgs>? VpcConfig { get; set; }

        public ServiceArgs()
        {
        }
    }

    public sealed class ServiceState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The function compute service description.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to allow the service to access Internet. Default to "true".
        /// </summary>
        [Input("internetAccess")]
        public Input<bool>? InternetAccess { get; set; }

        /// <summary>
        /// The date this resource was last modified.
        /// </summary>
        [Input("lastModified")]
        public Input<string>? LastModified { get; set; }

        /// <summary>
        /// Provide this to store your FC service logs. Fields documented below. See [Create a Service](https://www.alibabacloud.com/help/doc-detail/51924.htm).
        /// </summary>
        [Input("logConfig")]
        public Input<Inputs.ServiceLogConfigGetArgs>? LogConfig { get; set; }

        /// <summary>
        /// The Function Compute service name. It is the only in one Alicloud account and is conflict with "name_prefix".
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Setting a prefix to get a only name. It is conflict with "name".
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// RAM role arn attached to the Function Compute service. This governs both who / what can invoke your Function, as well as what resources our Function has access to. See [User Permissions](https://www.alibabacloud.com/help/doc-detail/52885.htm) for more details.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The Function Compute service ID.
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        /// <summary>
        /// Provide this to allow your FC service to access your VPC. Fields documented below. See [Function Compute Service in VPC](https://www.alibabacloud.com/help/faq-detail/72959.htm).
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ServiceVpcConfigGetArgs>? VpcConfig { get; set; }

        public ServiceState()
        {
        }
    }

    namespace Inputs
    {

    public sealed class ServiceLogConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The log store name of Logs service.
        /// </summary>
        [Input("logstore", required: true)]
        public Input<string> Logstore { get; set; } = null!;

        /// <summary>
        /// The project name of Logs service.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public ServiceLogConfigArgs()
        {
        }
    }

    public sealed class ServiceLogConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The log store name of Logs service.
        /// </summary>
        [Input("logstore", required: true)]
        public Input<string> Logstore { get; set; } = null!;

        /// <summary>
        /// The project name of Logs service.
        /// </summary>
        [Input("project", required: true)]
        public Input<string> Project { get; set; } = null!;

        public ServiceLogConfigGetArgs()
        {
        }
    }

    public sealed class ServiceVpcConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A security group ID associated with the FC service.
        /// </summary>
        [Input("securityGroupId", required: true)]
        public Input<string> SecurityGroupId { get; set; } = null!;

        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        [Input("vswitchIds", required: true)]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// A list of vswitch IDs associated with the FC service.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        public ServiceVpcConfigArgs()
        {
        }
    }

    public sealed class ServiceVpcConfigGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A security group ID associated with the FC service.
        /// </summary>
        [Input("securityGroupId", required: true)]
        public Input<string> SecurityGroupId { get; set; } = null!;

        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        [Input("vswitchIds", required: true)]
        private InputList<string>? _vswitchIds;

        /// <summary>
        /// A list of vswitch IDs associated with the FC service.
        /// </summary>
        public InputList<string> VswitchIds
        {
            get => _vswitchIds ?? (_vswitchIds = new InputList<string>());
            set => _vswitchIds = value;
        }

        public ServiceVpcConfigGetArgs()
        {
        }
    }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class ServiceLogConfig
    {
        /// <summary>
        /// The log store name of Logs service.
        /// </summary>
        public readonly string Logstore;
        /// <summary>
        /// The project name of Logs service.
        /// </summary>
        public readonly string Project;

        [OutputConstructor]
        private ServiceLogConfig(
            string logstore,
            string project)
        {
            Logstore = logstore;
            Project = project;
        }
    }

    [OutputType]
    public sealed class ServiceVpcConfig
    {
        /// <summary>
        /// A security group ID associated with the FC service.
        /// </summary>
        public readonly string SecurityGroupId;
        public readonly string VpcId;
        /// <summary>
        /// A list of vswitch IDs associated with the FC service.
        /// </summary>
        public readonly ImmutableArray<string> VswitchIds;

        [OutputConstructor]
        private ServiceVpcConfig(
            string securityGroupId,
            string vpcId,
            ImmutableArray<string> vswitchIds)
        {
            SecurityGroupId = securityGroupId;
            VpcId = vpcId;
            VswitchIds = vswitchIds;
        }
    }
    }
}