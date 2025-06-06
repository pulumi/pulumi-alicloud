// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Dms
{
    public static class GetEnterpriseUsers
    {
        /// <summary>
        /// This data source provides a list of DMS Enterprise Users in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.90.0+
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
        ///     // Declare the data source
        ///     var dmsEnterpriseUsersDs = AliCloud.Dms.GetEnterpriseUsers.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "uid",
        ///         },
        ///         Role = "USER",
        ///         Status = "NORMAL",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstUserId"] = dmsEnterpriseUsersDs.Apply(getEnterpriseUsersResult =&gt; getEnterpriseUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Task<GetEnterpriseUsersResult> InvokeAsync(GetEnterpriseUsersArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetEnterpriseUsersResult>("alicloud:dms/getEnterpriseUsers:getEnterpriseUsers", args ?? new GetEnterpriseUsersArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of DMS Enterprise Users in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.90.0+
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
        ///     // Declare the data source
        ///     var dmsEnterpriseUsersDs = AliCloud.Dms.GetEnterpriseUsers.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "uid",
        ///         },
        ///         Role = "USER",
        ///         Status = "NORMAL",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstUserId"] = dmsEnterpriseUsersDs.Apply(getEnterpriseUsersResult =&gt; getEnterpriseUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEnterpriseUsersResult> Invoke(GetEnterpriseUsersInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnterpriseUsersResult>("alicloud:dms/getEnterpriseUsers:getEnterpriseUsers", args ?? new GetEnterpriseUsersInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// This data source provides a list of DMS Enterprise Users in an Alibaba Cloud account according to the specified filters.
        /// 
        /// &gt; **NOTE:** Available in 1.90.0+
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
        ///     // Declare the data source
        ///     var dmsEnterpriseUsersDs = AliCloud.Dms.GetEnterpriseUsers.Invoke(new()
        ///     {
        ///         Ids = new[]
        ///         {
        ///             "uid",
        ///         },
        ///         Role = "USER",
        ///         Status = "NORMAL",
        ///     });
        /// 
        ///     return new Dictionary&lt;string, object?&gt;
        ///     {
        ///         ["firstUserId"] = dmsEnterpriseUsersDs.Apply(getEnterpriseUsersResult =&gt; getEnterpriseUsersResult.Users[0]?.Id),
        ///     };
        /// });
        /// ```
        /// </summary>
        public static Output<GetEnterpriseUsersResult> Invoke(GetEnterpriseUsersInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetEnterpriseUsersResult>("alicloud:dms/getEnterpriseUsers:getEnterpriseUsers", args ?? new GetEnterpriseUsersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetEnterpriseUsersArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of DMS Enterprise User IDs (UID).
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter the results by the DMS Enterprise User nick_name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The role of the user to query.
        /// </summary>
        [Input("role")]
        public string? Role { get; set; }

        /// <summary>
        /// The keyword used to query users.
        /// </summary>
        [Input("searchKey")]
        public string? SearchKey { get; set; }

        /// <summary>
        /// The status of the user.
        /// </summary>
        [Input("status")]
        public string? Status { get; set; }

        /// <summary>
        /// The ID of the tenant in DMS Enterprise.
        /// </summary>
        [Input("tid")]
        public int? Tid { get; set; }

        public GetEnterpriseUsersArgs()
        {
        }
        public static new GetEnterpriseUsersArgs Empty => new GetEnterpriseUsersArgs();
    }

    public sealed class GetEnterpriseUsersInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of DMS Enterprise User IDs (UID).
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// A regex string to filter the results by the DMS Enterprise User nick_name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        /// <summary>
        /// File name where to save data source results (after running `pulumi preview`).
        /// </summary>
        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The role of the user to query.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// The keyword used to query users.
        /// </summary>
        [Input("searchKey")]
        public Input<string>? SearchKey { get; set; }

        /// <summary>
        /// The status of the user.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The ID of the tenant in DMS Enterprise.
        /// </summary>
        [Input("tid")]
        public Input<int>? Tid { get; set; }

        public GetEnterpriseUsersInvokeArgs()
        {
        }
        public static new GetEnterpriseUsersInvokeArgs Empty => new GetEnterpriseUsersInvokeArgs();
    }


    [OutputType]
    public sealed class GetEnterpriseUsersResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// A list of DMS Enterprise User IDs (UID).
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string? NameRegex;
        /// <summary>
        /// A list of DMS Enterprise User names.
        /// </summary>
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? Role;
        public readonly string? SearchKey;
        /// <summary>
        /// The status of the user.
        /// </summary>
        public readonly string? Status;
        public readonly int? Tid;
        /// <summary>
        /// A list of DMS Enterprise Users. Each element contains the following attributes:
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEnterpriseUsersUserResult> Users;

        [OutputConstructor]
        private GetEnterpriseUsersResult(
            string id,

            ImmutableArray<string> ids,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? role,

            string? searchKey,

            string? status,

            int? tid,

            ImmutableArray<Outputs.GetEnterpriseUsersUserResult> users)
        {
            Id = id;
            Ids = ids;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            Role = role;
            SearchKey = searchKey;
            Status = status;
            Tid = tid;
            Users = users;
        }
    }
}
