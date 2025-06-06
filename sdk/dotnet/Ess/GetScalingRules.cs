// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ess
{
    public static class GetScalingRules
    {
        /// <summary>
        /// This data source provides available scaling rule resources. 
        /// 
        /// &gt; **NOTE:** Available since v1.39.0
        /// 
        /// ## Example Usage
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
        ///     var name = config.Get("name") ?? "terraform-ex";
        ///     var defaultInteger = new Random.Index.Integer("default", new()
        ///     {
        ///         Min = 10000,
        ///         Max = 99999,
        ///     });
        /// 
        ///     var myName = $"{name}-{defaultInteger.Result}";
        /// 
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = myName,
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "172.16.0.0/24",
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         VswitchName = myName,
        ///     });
        /// 
        ///     var defaultScalingGroup = new AliCloud.Ess.ScalingGroup("default", new()
        ///     {
        ///         MinSize = 1,
        ///         MaxSize = 1,
        ///         ScalingGroupName = myName,
        ///         RemovalPolicies = new[]
        ///         {
        ///             "OldestInstance",
        ///             "NewestInstance",
        ///         },
        ///         VswitchIds = new[]
        ///         {
        ///             defaultSwitch.Id,
        ///         },
        ///     });
        /// 
        ///     var defaultScalingRule = new AliCloud.Ess.ScalingRule("default", new()
        ///     {
        ///         ScalingGroupId = defaultScalingGroup.Id,
        ///         ScalingRuleName = myName,
        ///         AdjustmentType = "PercentChangeInCapacity",
        ///         AdjustmentValue = 1,
        ///     });
        /// 
        ///     var scalingrulesDs = AliCloud.Ess.GetScalingRules.Invoke(new()
        ///     {
        ///         ScalingGroupId = defaultScalingGroup.Id,
        ///         Ids = new[]
        ///         {
        ///             defaultScalingRule.Id,
        ///         },
        ///         NameRegex = myName,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstScalingRule"] = scalingrulesDs.Apply(getScalingRulesResult =&gt; getScalingRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetScalingRulesResult> InvokeAsync(GetScalingRulesArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetScalingRulesResult>("alicloud:ess/getScalingRules:getScalingRules", args ?? new GetScalingRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides available scaling rule resources. 
        /// 
        /// &gt; **NOTE:** Available since v1.39.0
        /// 
        /// ## Example Usage
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
        ///     var name = config.Get("name") ?? "terraform-ex";
        ///     var defaultInteger = new Random.Index.Integer("default", new()
        ///     {
        ///         Min = 10000,
        ///         Max = 99999,
        ///     });
        /// 
        ///     var myName = $"{name}-{defaultInteger.Result}";
        /// 
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = myName,
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "172.16.0.0/24",
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         VswitchName = myName,
        ///     });
        /// 
        ///     var defaultScalingGroup = new AliCloud.Ess.ScalingGroup("default", new()
        ///     {
        ///         MinSize = 1,
        ///         MaxSize = 1,
        ///         ScalingGroupName = myName,
        ///         RemovalPolicies = new[]
        ///         {
        ///             "OldestInstance",
        ///             "NewestInstance",
        ///         },
        ///         VswitchIds = new[]
        ///         {
        ///             defaultSwitch.Id,
        ///         },
        ///     });
        /// 
        ///     var defaultScalingRule = new AliCloud.Ess.ScalingRule("default", new()
        ///     {
        ///         ScalingGroupId = defaultScalingGroup.Id,
        ///         ScalingRuleName = myName,
        ///         AdjustmentType = "PercentChangeInCapacity",
        ///         AdjustmentValue = 1,
        ///     });
        /// 
        ///     var scalingrulesDs = AliCloud.Ess.GetScalingRules.Invoke(new()
        ///     {
        ///         ScalingGroupId = defaultScalingGroup.Id,
        ///         Ids = new[]
        ///         {
        ///             defaultScalingRule.Id,
        ///         },
        ///         NameRegex = myName,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstScalingRule"] = scalingrulesDs.Apply(getScalingRulesResult =&gt; getScalingRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetScalingRulesResult> Invoke(GetScalingRulesInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetScalingRulesResult>("alicloud:ess/getScalingRules:getScalingRules", args ?? new GetScalingRulesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides available scaling rule resources. 
        /// 
        /// &gt; **NOTE:** Available since v1.39.0
        /// 
        /// ## Example Usage
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
        ///     var name = config.Get("name") ?? "terraform-ex";
        ///     var defaultInteger = new Random.Index.Integer("default", new()
        ///     {
        ///         Min = 10000,
        ///         Max = 99999,
        ///     });
        /// 
        ///     var myName = $"{name}-{defaultInteger.Result}";
        /// 
        ///     var @default = AliCloud.GetZones.Invoke(new()
        ///     {
        ///         AvailableDiskCategory = "cloud_efficiency",
        ///         AvailableResourceCreation = "VSwitch",
        ///     });
        /// 
        ///     var defaultNetwork = new AliCloud.Vpc.Network("default", new()
        ///     {
        ///         VpcName = myName,
        ///         CidrBlock = "172.16.0.0/16",
        ///     });
        /// 
        ///     var defaultSwitch = new AliCloud.Vpc.Switch("default", new()
        ///     {
        ///         VpcId = defaultNetwork.Id,
        ///         CidrBlock = "172.16.0.0/24",
        ///         ZoneId = @default.Apply(@default =&gt; @default.Apply(getZonesResult =&gt; getZonesResult.Zones[0]?.Id)),
        ///         VswitchName = myName,
        ///     });
        /// 
        ///     var defaultScalingGroup = new AliCloud.Ess.ScalingGroup("default", new()
        ///     {
        ///         MinSize = 1,
        ///         MaxSize = 1,
        ///         ScalingGroupName = myName,
        ///         RemovalPolicies = new[]
        ///         {
        ///             "OldestInstance",
        ///             "NewestInstance",
        ///         },
        ///         VswitchIds = new[]
        ///         {
        ///             defaultSwitch.Id,
        ///         },
        ///     });
        /// 
        ///     var defaultScalingRule = new AliCloud.Ess.ScalingRule("default", new()
        ///     {
        ///         ScalingGroupId = defaultScalingGroup.Id,
        ///         ScalingRuleName = myName,
        ///         AdjustmentType = "PercentChangeInCapacity",
        ///         AdjustmentValue = 1,
        ///     });
        /// 
        ///     var scalingrulesDs = AliCloud.Ess.GetScalingRules.Invoke(new()
        ///     {
        ///         ScalingGroupId = defaultScalingGroup.Id,
        ///         Ids = new[]
        ///         {
        ///             defaultScalingRule.Id,
        ///         },
        ///         NameRegex = myName,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstScalingRule"] = scalingrulesDs.Apply(getScalingRulesResult =&gt; getScalingRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetScalingRulesResult> Invoke(GetScalingRulesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetScalingRulesResult>("alicloud:ess/getScalingRules:getScalingRules", args ?? new GetScalingRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetScalingRulesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of scaling rule IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter resulting scaling rules by name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// Scaling group id the scaling rules belong to.
        /// </summary>
        [Input("scalingGroupId")]
        public string? ScalingGroupId { get; set; }

        /// <summary>
        /// Type of scaling rule.
        /// </summary>
        [Input("type")]
        public string? Type { get; set; }

        public GetScalingRulesArgs()
        {
        }
        public static new GetScalingRulesArgs Empty => new GetScalingRulesArgs();
    }

    public sealed class GetScalingRulesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of scaling rule IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter resulting scaling rules by name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// Scaling group id the scaling rules belong to.
        /// </summary>
        [Input("scalingGroupId")]
        public Input<string>? ScalingGroupId { get; set; }

        /// <summary>
        /// Type of scaling rule.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GetScalingRulesInvokeArgs()
        {
        }
        public static new GetScalingRulesInvokeArgs Empty => new GetScalingRulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetScalingRulesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of scaling rule ids.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of scaling rule names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        /// <summary>
        /// A list of scaling rules. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetScalingRulesRuleResult> Rules;
        /// <summary>
        /// ID of the scaling group.
        /// </summary>
        public readonly string? ScalingGroupId;
        /// <summary>
        /// Type of the scaling rule.
        /// </summary>
        public readonly string? Type;

        [OutputConstructor]
        private GetScalingRulesResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetScalingRulesRuleResult> rules,

            string? scalingGroupId,

            string? type)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Rules = rules;
            ScalingGroupId = scalingGroupId;
            Type = type;
        }
    }
}
