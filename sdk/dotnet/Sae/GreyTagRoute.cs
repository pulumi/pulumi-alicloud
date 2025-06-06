// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Sae
{
    /// <summary>
    /// Provides a Serverless App Engine (SAE) GreyTagRoute resource.
    /// 
    /// For information about Serverless App Engine (SAE) GreyTagRoute and how to use it, see [What is GreyTagRoute](https://www.alibabacloud.com/help/en/sae/latest/create-grey-tag-route).
    /// 
    /// &gt; **NOTE:** Available since v1.160.0.
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
    /// using Random = Pulumi.Random;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var config = new Config();
    ///     var name = config.Get("name") ?? "tf-example";
    ///     var defaultInteger = new Random.Index.Integer("default", new()
    ///     {
    ///         Max = 99999,
    ///         Min = 10000,
    ///     });
    /// 
    ///     var @default = AliCloud.GetRegions.Invoke(new()
    ///     {
    ///         Current = true,
    ///     });
    /// 
    ///     var defaultGetZones = AliCloud.GetZones.Invoke(new()
    ///     {
    ///         AvailableResourceCreation = "VSwitch",
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = name,
    ///         CidrBlock = "10.4.0.0/16",
    ///     });
    /// 
    ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
    ///     {
    ///         VswitchName = name,
    ///         CidrBlock = "10.4.0.0/24",
    ///         VpcId = defaultNetwork.Id,
    ///         ZoneId = defaultGetZones.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id),
    ///     });
    /// 
    ///     var defaultSecurityGroup = new AliCloud.Ecs.SecurityGroup("default", new()
    ///     {
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultNamespace = new AliCloud.Sae.Namespace("default", new()
    ///     {
    ///         NamespaceId = @default.Apply(@default =&gt; $"{@default.Apply(getRegionsResult =&gt; getRegionsResult.Regions[0]?.Id)}:example{defaultInteger.Result}"),
    ///         NamespaceName = name,
    ///         NamespaceDescription = name,
    ///         EnableMicroRegistration = false,
    ///     });
    /// 
    ///     var defaultApplication = new AliCloud.Sae.Application("default", new()
    ///     {
    ///         AppDescription = name,
    ///         AppName = $"{name}-{defaultInteger.Result}",
    ///         NamespaceId = defaultNamespace.Id,
    ///         ImageUrl = @default.Apply(@default =&gt; $"registry-vpc.{@default.Apply(getRegionsResult =&gt; getRegionsResult.Regions[0]?.Id)}.aliyuncs.com/sae-demo-image/consumer:1.0"),
    ///         PackageType = "Image",
    ///         SecurityGroupId = defaultSecurityGroup.Id,
    ///         VpcId = defaultNetwork.Id,
    ///         VswitchId = defaultSwitch.Id,
    ///         Timezone = "Asia/Beijing",
    ///         Replicas = 5,
    ///         Cpu = 500,
    ///         Memory = 2048,
    ///     });
    /// 
    ///     var defaultGreyTagRoute = new AliCloud.Sae.GreyTagRoute("default", new()
    ///     {
    ///         GreyTagRouteName = name,
    ///         Description = name,
    ///         AppId = defaultApplication.Id,
    ///         ScRules = new[]
    ///         {
    ///             new AliCloud.Sae.Inputs.GreyTagRouteScRuleArgs
    ///             {
    ///                 Items = new[]
    ///                 {
    ///                     new AliCloud.Sae.Inputs.GreyTagRouteScRuleItemArgs
    ///                     {
    ///                         Type = "param",
    ///                         Name = "tfexample",
    ///                         Operator = "rawvalue",
    ///                         Value = "example",
    ///                         Cond = "==",
    ///                     },
    ///                 },
    ///                 Path = "/tf/example",
    ///                 Condition = "AND",
    ///             },
    ///         },
    ///         DubboRules = new[]
    ///         {
    ///             new AliCloud.Sae.Inputs.GreyTagRouteDubboRuleArgs
    ///             {
    ///                 Items = new[]
    ///                 {
    ///                     new AliCloud.Sae.Inputs.GreyTagRouteDubboRuleItemArgs
    ///                     {
    ///                         Cond = "==",
    ///                         Expr = ".key1",
    ///                         Index = 1,
    ///                         Operator = "rawvalue",
    ///                         Value = "value1",
    ///                     },
    ///                 },
    ///                 Condition = "OR",
    ///                 Group = "DUBBO",
    ///                 MethodName = "example",
    ///                 ServiceName = "com.example.service",
    ///                 Version = "1.0.0",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Serverless App Engine (SAE) GreyTagRoute can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:sae/greyTagRoute:GreyTagRoute example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:sae/greyTagRoute:GreyTagRoute")]
    public partial class GreyTagRoute : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID  of the SAE Application.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// The description of GreyTagRoute.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The grayscale rule created for Dubbo Application. See `dubbo_rules` below.
        /// </summary>
        [Output("dubboRules")]
        public Output<ImmutableArray<Outputs.GreyTagRouteDubboRule>> DubboRules { get; private set; } = null!;

        /// <summary>
        /// The name of GreyTagRoute.
        /// </summary>
        [Output("greyTagRouteName")]
        public Output<string> GreyTagRouteName { get; private set; } = null!;

        /// <summary>
        /// The grayscale rule created for SpringCloud Application. See `sc_rules` below.
        /// </summary>
        [Output("scRules")]
        public Output<ImmutableArray<Outputs.GreyTagRouteScRule>> ScRules { get; private set; } = null!;


        /// <summary>
        /// Create a GreyTagRoute resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GreyTagRoute(string name, GreyTagRouteArgs args, CustomResourceOptions? options = null)
            : base("alicloud:sae/greyTagRoute:GreyTagRoute", name, args ?? new GreyTagRouteArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GreyTagRoute(string name, Input<string> id, GreyTagRouteState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:sae/greyTagRoute:GreyTagRoute", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GreyTagRoute resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GreyTagRoute Get(string name, Input<string> id, GreyTagRouteState? state = null, CustomResourceOptions? options = null)
        {
            return new GreyTagRoute(name, id, state, options);
        }
    }

    public sealed class GreyTagRouteArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID  of the SAE Application.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// The description of GreyTagRoute.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dubboRules")]
        private InputList<Inputs.GreyTagRouteDubboRuleArgs>? _dubboRules;

        /// <summary>
        /// The grayscale rule created for Dubbo Application. See `dubbo_rules` below.
        /// </summary>
        public InputList<Inputs.GreyTagRouteDubboRuleArgs> DubboRules
        {
            get => _dubboRules ?? (_dubboRules = new InputList<Inputs.GreyTagRouteDubboRuleArgs>());
            set => _dubboRules = value;
        }

        /// <summary>
        /// The name of GreyTagRoute.
        /// </summary>
        [Input("greyTagRouteName", required: true)]
        public Input<string> GreyTagRouteName { get; set; } = null!;

        [Input("scRules")]
        private InputList<Inputs.GreyTagRouteScRuleArgs>? _scRules;

        /// <summary>
        /// The grayscale rule created for SpringCloud Application. See `sc_rules` below.
        /// </summary>
        public InputList<Inputs.GreyTagRouteScRuleArgs> ScRules
        {
            get => _scRules ?? (_scRules = new InputList<Inputs.GreyTagRouteScRuleArgs>());
            set => _scRules = value;
        }

        public GreyTagRouteArgs()
        {
        }
        public static new GreyTagRouteArgs Empty => new GreyTagRouteArgs();
    }

    public sealed class GreyTagRouteState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID  of the SAE Application.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// The description of GreyTagRoute.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("dubboRules")]
        private InputList<Inputs.GreyTagRouteDubboRuleGetArgs>? _dubboRules;

        /// <summary>
        /// The grayscale rule created for Dubbo Application. See `dubbo_rules` below.
        /// </summary>
        public InputList<Inputs.GreyTagRouteDubboRuleGetArgs> DubboRules
        {
            get => _dubboRules ?? (_dubboRules = new InputList<Inputs.GreyTagRouteDubboRuleGetArgs>());
            set => _dubboRules = value;
        }

        /// <summary>
        /// The name of GreyTagRoute.
        /// </summary>
        [Input("greyTagRouteName")]
        public Input<string>? GreyTagRouteName { get; set; }

        [Input("scRules")]
        private InputList<Inputs.GreyTagRouteScRuleGetArgs>? _scRules;

        /// <summary>
        /// The grayscale rule created for SpringCloud Application. See `sc_rules` below.
        /// </summary>
        public InputList<Inputs.GreyTagRouteScRuleGetArgs> ScRules
        {
            get => _scRules ?? (_scRules = new InputList<Inputs.GreyTagRouteScRuleGetArgs>());
            set => _scRules = value;
        }

        public GreyTagRouteState()
        {
        }
        public static new GreyTagRouteState Empty => new GreyTagRouteState();
    }
}
