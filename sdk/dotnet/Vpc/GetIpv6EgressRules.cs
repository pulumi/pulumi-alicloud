// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Vpc
{
    public static class GetIpv6EgressRules
    {
        /// <summary>
        /// This data source provides the Vpc Ipv6 Egress Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var ids = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         NameRegex = "^my-Ipv6EgressRule",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Status = "Available",
        ///     });
        /// 
        ///     var ipv6EgressRuleName = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Ipv6EgressRuleName = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcIpv6EgressRuleId1"] = ids.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId2"] = nameRegex.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId3"] = status.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId4"] = ipv6EgressRuleName.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetIpv6EgressRulesResult> InvokeAsync(GetIpv6EgressRulesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIpv6EgressRulesResult>("alicloud:vpc/getIpv6EgressRules:getIpv6EgressRules", args ?? new GetIpv6EgressRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Ipv6 Egress Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var ids = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         NameRegex = "^my-Ipv6EgressRule",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Status = "Available",
        ///     });
        /// 
        ///     var ipv6EgressRuleName = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Ipv6EgressRuleName = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcIpv6EgressRuleId1"] = ids.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId2"] = nameRegex.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId3"] = status.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId4"] = ipv6EgressRuleName.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpv6EgressRulesResult> Invoke(GetIpv6EgressRulesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpv6EgressRulesResult>("alicloud:vpc/getIpv6EgressRules:getIpv6EgressRules", args ?? new GetIpv6EgressRulesInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Vpc Ipv6 Egress Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.142.0+.
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
        ///     var ids = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         NameRegex = "^my-Ipv6EgressRule",
        ///     });
        /// 
        ///     var status = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Status = "Available",
        ///     });
        /// 
        ///     var ipv6EgressRuleName = AliCloud.Vpc.GetIpv6EgressRules.Invoke(new()
        ///     {
        ///         Ipv6GatewayId = "example_value",
        ///         Ipv6EgressRuleName = "example_value",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["vpcIpv6EgressRuleId1"] = ids.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId2"] = nameRegex.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId3"] = status.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///         ["vpcIpv6EgressRuleId4"] = ipv6EgressRuleName.Apply(getIpv6EgressRulesResult =&gt; getIpv6EgressRulesResult.Rules[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetIpv6EgressRulesResult> Invoke(GetIpv6EgressRulesInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetIpv6EgressRulesResult>("alicloud:vpc/getIpv6EgressRules:getIpv6EgressRules", args ?? new GetIpv6EgressRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIpv6EgressRulesArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Ipv6 Egress Rule IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the instance that is associated with the IPv6 address to which the egress-only rule is applied.
        /// </summary>
        [Input("instanceId")]
        public string? InstanceId { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("ipv6EgressRuleName")]
        public string? Ipv6EgressRuleName { get; set; }

        /// <summary>
        /// The ID of the IPv6 gateway.
        /// </summary>
        [Input("ipv6GatewayId", required: true)]
        public string Ipv6GatewayId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Ipv6 Egress Rule name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetIpv6EgressRulesArgs()
        {
        }
        public static new GetIpv6EgressRulesArgs Empty => new GetIpv6EgressRulesArgs();
    }

    public sealed class GetIpv6EgressRulesInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Ipv6 Egress Rule IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The ID of the instance that is associated with the IPv6 address to which the egress-only rule is applied.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// The name of the resource.
        /// </summary>
        [Input("ipv6EgressRuleName")]
        public Input<string>? Ipv6EgressRuleName { get; set; }

        /// <summary>
        /// The ID of the IPv6 gateway.
        /// </summary>
        [Input("ipv6GatewayId", required: true)]
        public Input<string> Ipv6GatewayId { get; set; } = null!;

        /// <summary>
        /// A regex string to filter results by Ipv6 Egress Rule name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The status of the resource. Valid values: `Available`, `Deleting`, `Pending`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetIpv6EgressRulesInvokeArgs()
        {
        }
        public static new GetIpv6EgressRulesInvokeArgs Empty => new GetIpv6EgressRulesInvokeArgs();
    }


    [OutputType]
    public sealed class GetIpv6EgressRulesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? InstanceId;
        public readonly string? Ipv6EgressRuleName;
        public readonly string Ipv6GatewayId;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<Outputs.GetIpv6EgressRulesRuleResult> Rules;
        public readonly string? Status;

        [OutputConstructor]
        private GetIpv6EgressRulesResult(
            string id,

            ImmutableArray<string> ids,

            string? instanceId,

            string? ipv6EgressRuleName,

            string ipv6GatewayId,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<Outputs.GetIpv6EgressRulesRuleResult> rules,

            string? status)
        {
            Id = id;
            Ids = ids;
            InstanceId = instanceId;
            Ipv6EgressRuleName = ipv6EgressRuleName;
            Ipv6GatewayId = ipv6GatewayId;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Rules = rules;
            Status = status;
        }
    }
}
