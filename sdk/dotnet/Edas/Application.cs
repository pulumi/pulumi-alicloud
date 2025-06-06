// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Edas
{
    /// <summary>
    /// Creates an EDAS ecs application on EDAS, see [What is EDAS Application](https://www.alibabacloud.com/help/en/edas/developer-reference/api-edas-2017-08-01-insertapplication). The application will be deployed when `group_id` and `war_url` are given.
    /// 
    /// &gt; **NOTE:** Available since v1.82.0.
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
    ///         Min = 10000,
    ///         Max = 99999,
    ///     });
    /// 
    ///     var @default = AliCloud.GetRegions.Invoke(new()
    ///     {
    ///         Current = true,
    ///     });
    /// 
    ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
    ///     {
    ///         VpcName = $"{name}-{defaultInteger.Result}",
    ///         CidrBlock = "10.4.0.0/16",
    ///     });
    /// 
    ///     var defaultCluster = new AliCloud.Edas.Cluster("default", new()
    ///     {
    ///         ClusterName = $"{name}-{defaultInteger.Result}",
    ///         ClusterType = 2,
    ///         NetworkMode = 2,
    ///         LogicalRegionId = @default.Apply(@default =&gt; @default.Apply(getRegionsResult =&gt; getRegionsResult.Regions[0]?.Id)),
    ///         VpcId = defaultNetwork.Id,
    ///     });
    /// 
    ///     var defaultApplication = new AliCloud.Edas.Application("default", new()
    ///     {
    ///         ApplicationName = $"{name}-{defaultInteger.Result}",
    ///         ClusterId = defaultCluster.Id,
    ///         PackageType = "JAR",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// EDAS application can be imported using the id, e.g.
    /// 
    /// ```sh
    /// $ pulumi import alicloud:edas/application:Application app app_Id
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:edas/application:Application")]
    public partial class Application : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
        /// </summary>
        [Output("applicationName")]
        public Output<string> ApplicationName { get; private set; } = null!;

        /// <summary>
        /// The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the "Pack ID" column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
        /// </summary>
        [Output("buildPackId")]
        public Output<int?> BuildPackId { get; private set; } = null!;

        /// <summary>
        /// The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter.
        /// </summary>
        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        /// <summary>
        /// The description of the application that you want to create.
        /// </summary>
        [Output("descriotion")]
        public Output<string?> Descriotion { get; private set; } = null!;

        /// <summary>
        /// The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        /// </summary>
        [Output("ecuInfos")]
        public Output<ImmutableArray<string>> EcuInfos { get; private set; } = null!;

        /// <summary>
        /// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
        /// </summary>
        [Output("groupId")]
        public Output<string?> GroupId { get; private set; } = null!;

        /// <summary>
        /// The URL for health checking of the application.
        /// </summary>
        [Output("healthCheckUrl")]
        public Output<string?> HealthCheckUrl { get; private set; } = null!;

        /// <summary>
        /// The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
        /// </summary>
        [Output("logicalRegionId")]
        public Output<string?> LogicalRegionId { get; private set; } = null!;

        /// <summary>
        /// The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
        /// </summary>
        [Output("packageType")]
        public Output<string> PackageType { get; private set; } = null!;

        /// <summary>
        /// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
        /// </summary>
        [Output("packageVersion")]
        public Output<string?> PackageVersion { get; private set; } = null!;

        /// <summary>
        /// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
        /// </summary>
        [Output("warUrl")]
        public Output<string?> WarUrl { get; private set; } = null!;


        /// <summary>
        /// Create a Application resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Application(string name, ApplicationArgs args, CustomResourceOptions? options = null)
            : base("alicloud:edas/application:Application", name, args ?? new ApplicationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Application(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:edas/application:Application", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Application resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Application Get(string name, Input<string> id, ApplicationState? state = null, CustomResourceOptions? options = null)
        {
            return new Application(name, id, state, options);
        }
    }

    public sealed class ApplicationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
        /// </summary>
        [Input("applicationName", required: true)]
        public Input<string> ApplicationName { get; set; } = null!;

        /// <summary>
        /// The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the "Pack ID" column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
        /// </summary>
        [Input("buildPackId")]
        public Input<int>? BuildPackId { get; set; }

        /// <summary>
        /// The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter.
        /// </summary>
        [Input("clusterId", required: true)]
        public Input<string> ClusterId { get; set; } = null!;

        /// <summary>
        /// The description of the application that you want to create.
        /// </summary>
        [Input("descriotion")]
        public Input<string>? Descriotion { get; set; }

        [Input("ecuInfos")]
        private InputList<string>? _ecuInfos;

        /// <summary>
        /// The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        /// </summary>
        public InputList<string> EcuInfos
        {
            get => _ecuInfos ?? (_ecuInfos = new InputList<string>());
            set => _ecuInfos = value;
        }

        /// <summary>
        /// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The URL for health checking of the application.
        /// </summary>
        [Input("healthCheckUrl")]
        public Input<string>? HealthCheckUrl { get; set; }

        /// <summary>
        /// The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
        /// </summary>
        [Input("logicalRegionId")]
        public Input<string>? LogicalRegionId { get; set; }

        /// <summary>
        /// The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
        /// </summary>
        [Input("packageType", required: true)]
        public Input<string> PackageType { get; set; } = null!;

        /// <summary>
        /// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
        /// </summary>
        [Input("packageVersion")]
        public Input<string>? PackageVersion { get; set; }

        /// <summary>
        /// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
        /// </summary>
        [Input("warUrl")]
        public Input<string>? WarUrl { get; set; }

        public ApplicationArgs()
        {
        }
        public static new ApplicationArgs Empty => new ApplicationArgs();
    }

    public sealed class ApplicationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of your EDAS application. Only letters '-' '_' and numbers are allowed. The length cannot exceed 36 characters.
        /// </summary>
        [Input("applicationName")]
        public Input<string>? ApplicationName { get; set; }

        /// <summary>
        /// The package ID of Enterprise Distributed Application Service (EDAS) Container, which can be retrieved by calling container version list interface ListBuildPack or the "Pack ID" column in container version list. When creating High-speed Service Framework (HSF) application, this parameter is required.
        /// </summary>
        [Input("buildPackId")]
        public Input<int>? BuildPackId { get; set; }

        /// <summary>
        /// The ID of the cluster that you want to create the application. The default cluster will be used if you do not specify this parameter.
        /// </summary>
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        /// <summary>
        /// The description of the application that you want to create.
        /// </summary>
        [Input("descriotion")]
        public Input<string>? Descriotion { get; set; }

        [Input("ecuInfos")]
        private InputList<string>? _ecuInfos;

        /// <summary>
        /// The ID of the Elastic Compute Unit (ECU) where you want to deploy the application. Type: List.
        /// </summary>
        public InputList<string> EcuInfos
        {
            get => _ecuInfos ?? (_ecuInfos = new InputList<string>());
            set => _ecuInfos = value;
        }

        /// <summary>
        /// The ID of the instance group where the application is going to be deployed. Set this parameter to all if you want to deploy the application to all groups.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// The URL for health checking of the application.
        /// </summary>
        [Input("healthCheckUrl")]
        public Input<string>? HealthCheckUrl { get; set; }

        /// <summary>
        /// The ID of the namespace where you want to create the application. You can call the ListUserDefineRegion operation to query the namespace ID.
        /// </summary>
        [Input("logicalRegionId")]
        public Input<string>? LogicalRegionId { get; set; }

        /// <summary>
        /// The type of the package for the deployment of the application that you want to create. The valid values are: WAR and JAR. We strongly recommend you to set this parameter when creating the application.
        /// </summary>
        [Input("packageType")]
        public Input<string>? PackageType { get; set; }

        /// <summary>
        /// The version of the application that you want to deploy. It must be unique for every application. The length cannot exceed 64 characters. We recommended you to use a timestamp.
        /// </summary>
        [Input("packageVersion")]
        public Input<string>? PackageVersion { get; set; }

        /// <summary>
        /// The address to store the uploaded web application (WAR) package for application deployment. This parameter is required when the deployType parameter is set as url.
        /// </summary>
        [Input("warUrl")]
        public Input<string>? WarUrl { get; set; }

        public ApplicationState()
        {
        }
        public static new ApplicationState Empty => new ApplicationState();
    }
}
