// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    public static class GetSecurityGroups
    {
        /// <summary>
        /// This data source provides a list of Security Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Filter security groups and print the results into a file
        ///     var secGroupsDs = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         NameRegex = "^web-",
        ///         OutputFile = "web_access.json",
        ///     });
        /// 
        ///     // In conjunction with a VPC
        ///     var primaryVpcDs = new AliCloud.Vpc.Network("primary_vpc_ds");
        /// 
        ///     var primarySecGroupsDs = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         VpcId = primaryVpcDs.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGroupId"] = primarySecGroupsDs.Apply(getSecurityGroupsResult =&gt; getSecurityGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetSecurityGroupsResult> InvokeAsync(GetSecurityGroupsArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSecurityGroupsResult>("alicloud:ecs/getSecurityGroups:getSecurityGroups", args ?? new GetSecurityGroupsArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of Security Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Filter security groups and print the results into a file
        ///     var secGroupsDs = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         NameRegex = "^web-",
        ///         OutputFile = "web_access.json",
        ///     });
        /// 
        ///     // In conjunction with a VPC
        ///     var primaryVpcDs = new AliCloud.Vpc.Network("primary_vpc_ds");
        /// 
        ///     var primarySecGroupsDs = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         VpcId = primaryVpcDs.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGroupId"] = primarySecGroupsDs.Apply(getSecurityGroupsResult =&gt; getSecurityGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSecurityGroupsResult> Invoke(GetSecurityGroupsInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecurityGroupsResult>("alicloud:ecs/getSecurityGroups:getSecurityGroups", args ?? new GetSecurityGroupsInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of Security Groups in an Alibaba Cloud account according to the specified filters.
        /// 
        /// ## Example Usage
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     // Filter security groups and print the results into a file
        ///     var secGroupsDs = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         NameRegex = "^web-",
        ///         OutputFile = "web_access.json",
        ///     });
        /// 
        ///     // In conjunction with a VPC
        ///     var primaryVpcDs = new AliCloud.Vpc.Network("primary_vpc_ds");
        /// 
        ///     var primarySecGroupsDs = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         VpcId = primaryVpcDs.Id,
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstGroupId"] = primarySecGroupsDs.Apply(getSecurityGroupsResult =&gt; getSecurityGroupsResult.Groups[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetSecurityGroupsResult> Invoke(GetSecurityGroupsInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetSecurityGroupsResult>("alicloud:ecs/getSecurityGroups:getSecurityGroups", args ?? new GetSecurityGroupsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSecurityGroupsArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Security Group IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter the resulting security groups by their names.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        [Input("pageNumber")]
        public int? PageNumber { get; set; }

        [Input("pageSize")]
        public int? PageSize { get; set; }

        /// <summary>
        /// The Id of resource group which the security_group belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public string? ResourceGroupId { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A map of tags assigned to the ECS instances. It must be in the format:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var taggedSecurityGroups = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "tagKey1", "tagValue1" },
        ///             { "tagKey2", "tagValue2" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        /// <summary>
        /// Used to retrieve security groups that belong to the specified VPC ID.
        /// </summary>
        [Input("vpcId")]
        public string? VpcId { get; set; }

        public GetSecurityGroupsArgs()
        {
        }
        public static new GetSecurityGroupsArgs Empty => new GetSecurityGroupsArgs();
    }

    public sealed class GetSecurityGroupsInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Security Group IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter the resulting security groups by their names.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        [Input("pageNumber")]
        public Input<int>? PageNumber { get; set; }

        [Input("pageSize")]
        public Input<int>? PageSize { get; set; }

        /// <summary>
        /// The Id of resource group which the security_group belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags assigned to the ECS instances. It must be in the format:
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using AliCloud = Pulumi.AliCloud;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var taggedSecurityGroups = AliCloud.Ecs.GetSecurityGroups.Invoke(new()
        ///     {
        ///         Tags = 
        ///         {
        ///             { "tagKey1", "tagValue1" },
        ///             { "tagKey2", "tagValue2" },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Used to retrieve security groups that belong to the specified VPC ID.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public GetSecurityGroupsInvokeArgs()
        {
        }
        public static new GetSecurityGroupsInvokeArgs Empty => new GetSecurityGroupsInvokeArgs();
    }


    [OutputType]
    public sealed class GetSecurityGroupsResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// A list of Security Groups. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetSecurityGroupsGroupResult> Groups;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of Security Group IDs.
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of Security Group names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly int? PageNumber;
        public readonly int? PageSize;
        /// <summary>
        /// The Id of resource group which the security_group belongs.
        /// </summary>
        public readonly string? ResourceGroupId;
        /// <summary>
        /// A map of tags assigned to the ECS instance.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        public readonly int TotalCount;
        /// <summary>
        /// The ID of the VPC that owns the security group.
        /// </summary>
        public readonly string? VpcId;

        [OutputConstructor]
        private GetSecurityGroupsResult(
            bool? enableDetails,

            ImmutableArray<Outputs.GetSecurityGroupsGroupResult> groups,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            int? pageNumber,

            int? pageSize,

            string? resourceGroupId,

            ImmutableDictionary<string, string>? tags,

            int totalCount,

            string? vpcId)
        {
            EnableDetails = enableDetails;
            Groups = groups;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            PageNumber = pageNumber;
            PageSize = pageSize;
            ResourceGroupId = resourceGroupId;
            Tags = tags;
            TotalCount = totalCount;
            VpcId = vpcId;
        }
    }
}
