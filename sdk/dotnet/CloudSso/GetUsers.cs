// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.CloudSso
{
    public static class GetUsers
    {
        /// <summary>
        /// This data source provides the Cloud Sso Users of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
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
        ///     var ids = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         NameRegex = "^my-User",
        ///     });
        /// 
        ///     var provisionType = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///         },
        ///         ProvisionType = "Manual",
        ///     });
        /// 
        ///     var status = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///         },
        ///         Status = "Enabled",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoUserId1"] = ids.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId2"] = nameRegex.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId3"] = provisionType.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId4"] = status.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetUsersResult> InvokeAsync(GetUsersArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetUsersResult>("alicloud:cloudsso/getUsers:getUsers", args ?? new GetUsersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Sso Users of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
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
        ///     var ids = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         NameRegex = "^my-User",
        ///     });
        /// 
        ///     var provisionType = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///         },
        ///         ProvisionType = "Manual",
        ///     });
        /// 
        ///     var status = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///         },
        ///         Status = "Enabled",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoUserId1"] = ids.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId2"] = nameRegex.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId3"] = provisionType.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId4"] = status.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetUsersResult>("alicloud:cloudsso/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides the Cloud Sso Users of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.140.0+.
        /// 
        /// &gt; **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
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
        ///     var ids = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///             "example_value-2",
        ///         },
        ///     });
        /// 
        ///     var nameRegex = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         NameRegex = "^my-User",
        ///     });
        /// 
        ///     var provisionType = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///         },
        ///         ProvisionType = "Manual",
        ///     });
        /// 
        ///     var status = AliCloud.CloudSso.GetUsers.Invoke(new()
        ///     {
        ///         DirectoryId = "example_value",
        ///         Ids = new[]
        ///         {
        ///             "example_value-1",
        ///         },
        ///         Status = "Enabled",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["cloudSsoUserId1"] = ids.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId2"] = nameRegex.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId3"] = provisionType.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///         ["cloudSsoUserId4"] = status.Apply(getUsersResult =&gt; getUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetUsersResult> Invoke(GetUsersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetUsersResult>("alicloud:cloudsso/getUsers:getUsers", args ?? new GetUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUsersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public string DirectoryId { get; set; } = null!;

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of User IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by User name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// ProvisionType. Valid values: `Manual`, `Synchronized`.
        /// </summary>
        [Input("provisionType")]
        public string? ProvisionType { get; set; }

        /// <summary>
        /// The status of user. Valid values: `Disabled`, `Enabled`.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        public GetUsersArgs()
        {
        }
        public static new GetUsersArgs Empty => new GetUsersArgs();
    }

    public sealed class GetUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Directory.
        /// </summary>
        [Input("directoryId", required: true)]
        public Input<string> DirectoryId { get; set; } = null!;

        /// <summary>
        /// Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of User IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter results by User name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// ProvisionType. Valid values: `Manual`, `Synchronized`.
        /// </summary>
        [Input("provisionType")]
        public Input<string>? ProvisionType { get; set; }

        /// <summary>
        /// The status of user. Valid values: `Disabled`, `Enabled`.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public GetUsersInvokeArgs()
        {
        }
        public static new GetUsersInvokeArgs Empty => new GetUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetUsersResult
    {
        public readonly string DirectoryId;
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? ProvisionType;
        public readonly string? Status;
        public readonly ImmutableArray<Outputs.GetUsersUserResult> Users;

        [OutputConstructor]
        private GetUsersResult(
            string directoryId,

            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? provisionType,

            string? status,

            ImmutableArray<Outputs.GetUsersUserResult> users)
        {
            DirectoryId = directoryId;
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            ProvisionType = provisionType;
            Status = status;
            Users = users;
        }
    }
}
