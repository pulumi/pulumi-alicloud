// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Alb
{
    public static class GetRules
    {
        /// <summary>
        /// This data source provides the Alb Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Alb.GetRules.InvokeAsync(new AliCloud.Alb.GetRulesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.AlbRuleId1 = ids.Apply(ids =&gt; ids.Rules?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Alb.GetRules.InvokeAsync(new AliCloud.Alb.GetRulesArgs
        ///         {
        ///             NameRegex = "^my-Rule",
        ///         }));
        ///         this.AlbRuleId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Rules?[0]?.Id);
        ///     }
        /// 
        ///     [Output("albRuleId1")]
        ///     public Output&lt;string&gt; AlbRuleId1 { get; set; }
        ///     [Output("albRuleId2")]
        ///     public Output&lt;string&gt; AlbRuleId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetRulesResult> InvokeAsync(GetRulesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetRulesResult>("alicloud:alb/getRules:getRules", args ?? new GetRulesArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Alb Rules of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.133.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic Usage
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var ids = Output.Create(AliCloud.Alb.GetRules.InvokeAsync(new AliCloud.Alb.GetRulesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_id",
        ///             },
        ///         }));
        ///         this.AlbRuleId1 = ids.Apply(ids =&gt; ids.Rules?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Alb.GetRules.InvokeAsync(new AliCloud.Alb.GetRulesArgs
        ///         {
        ///             NameRegex = "^my-Rule",
        ///         }));
        ///         this.AlbRuleId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Rules?[0]?.Id);
        ///     }
        /// 
        ///     [Output("albRuleId1")]
        ///     public Output&lt;string&gt; AlbRuleId1 { get; set; }
        ///     [Output("albRuleId2")]
        ///     public Output&lt;string&gt; AlbRuleId2 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetRulesResult> Invoke(GetRulesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetRulesResult>("alicloud:alb/getRules:getRules", args ?? new GetRulesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetRulesArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Rule IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        [Input("listenerIds")]
        private List<string>? _listenerIds;

        /// <summary>
        /// The listener ids.
        /// </summary>
        public List<string> ListenerIds
        {
            get => _listenerIds ?? (_listenerIds = new List<string>());
            set => _listenerIds = value;
        }

        [Input("loadBalancerIds")]
        private List<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public List<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new List<string>());
            set => _loadBalancerIds = value;
        }

        /// <summary>
        /// A regex string to filter results by Rule name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("ruleIds")]
        private List<string>? _ruleIds;

        /// <summary>
        /// The rule ids.
        /// </summary>
        public List<string> RuleIds
        {
            get => _ruleIds ?? (_ruleIds = new List<string>());
            set => _ruleIds = value;
        }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetRulesArgs()
        {
        }
    }

    public sealed class GetRulesInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Rule IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        [Input("listenerIds")]
        private InputList<string>? _listenerIds;

        /// <summary>
        /// The listener ids.
        /// </summary>
        public InputList<string> ListenerIds
        {
            get => _listenerIds ?? (_listenerIds = new InputList<string>());
            set => _listenerIds = value;
        }

        [Input("loadBalancerIds")]
        private InputList<string>? _loadBalancerIds;

        /// <summary>
        /// The load balancer ids.
        /// </summary>
        public InputList<string> LoadBalancerIds
        {
            get => _loadBalancerIds ?? (_loadBalancerIds = new InputList<string>());
            set => _loadBalancerIds = value;
        }

        /// <summary>
        /// A regex string to filter results by Rule name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("ruleIds")]
        private InputList<string>? _ruleIds;

        /// <summary>
        /// The rule ids.
        /// </summary>
        public InputList<string> RuleIds
        {
            get => _ruleIds ?? (_ruleIds = new InputList<string>());
            set => _ruleIds = value;
        }

        /// <summary>
        /// The status of the resource.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetRulesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetRulesResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableArray<string> ListenerIds;
        public readonly ImmutableArray<string> LoadBalancerIds;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly ImmutableArray<string> RuleIds;
        public readonly ImmutableArray<Outputs.GetRulesRuleResult> Rules;
        public readonly string? Status;

        [OutputConstructor]
        private GetRulesResult(
            string id,

            ImmutableArray<string> ids,

            ImmutableArray<string> listenerIds,

            ImmutableArray<string> loadBalancerIds,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            ImmutableArray<string> ruleIds,

            ImmutableArray<Outputs.GetRulesRuleResult> rules,

            string? status)
        {
            Id = id;
            Ids = ids;
            ListenerIds = listenerIds;
            LoadBalancerIds = loadBalancerIds;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            RuleIds = ruleIds;
            Rules = rules;
            Status = status;
        }
    }
}